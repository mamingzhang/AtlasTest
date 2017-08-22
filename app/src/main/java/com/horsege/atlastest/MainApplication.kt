package com.horsege.atlastest

import android.app.Application
import android.content.Intent
import android.taobao.atlas.bundleInfo.AtlasBundleInfoManager
import android.taobao.atlas.framework.Atlas
import android.taobao.atlas.runtime.ActivityTaskMgr
import android.text.TextUtils
import android.widget.Toast
import org.osgi.framework.BundleException
import java.io.File

/**
 * Created by mamingzhang on 2017/8/16.
 */
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Atlas.getInstance().setClassNotFoundInterceptorCallback {
            val className = it.getComponent().getClassName()
            val bundleName = AtlasBundleInfoManager.instance().getBundleForComponet(className)

            if (!TextUtils.isEmpty(bundleName) && !AtlasBundleInfoManager.instance().isInternalBundle(bundleName)) {

                //远程bundle
                val activity = ActivityTaskMgr.getInstance().peekTopActivity()
                val remoteBundleFile = File(activity.externalCacheDir, "lib" + bundleName.replace(".", "_") + ".so")

                var path = ""
                if (remoteBundleFile.exists()) {
                    path = remoteBundleFile.absolutePath
                } else {
                    Toast.makeText(activity, " 远程bundle不存在，请确定 : " + remoteBundleFile.absolutePath, Toast.LENGTH_LONG).show()
                    return@setClassNotFoundInterceptorCallback it
                }


                val info = activity.packageManager.getPackageArchiveInfo(path, 0)
                try {
                    Atlas.getInstance().installBundle(info.packageName, File(path))
                } catch (e: BundleException) {
                    Toast.makeText(activity, " 远程bundle 安装失败，" + e.message, Toast.LENGTH_LONG).show()

                    e.printStackTrace()
                }

                activity.startActivities(arrayOf<Intent>(it))

            }

            return@setClassNotFoundInterceptorCallback it
        }
    }
}