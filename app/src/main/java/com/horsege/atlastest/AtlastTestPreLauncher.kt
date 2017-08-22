package com.horsege.atlastest

import android.content.Context
import android.taobao.atlas.runtime.AtlasPreLauncher
import android.util.Log

/**
 * Created by mamingzhang on 2017/8/22.
 */
class AtlastTestPreLauncher : AtlasPreLauncher {
    override fun initBeforeAtlas(context: Context?) {
        Log.e("mmz", "initBeforeAtlas")
    }
}