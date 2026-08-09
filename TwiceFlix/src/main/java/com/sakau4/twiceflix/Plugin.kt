package com.sakau4.twiceflix

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class TwiceflixPlugin: Plugin() {
    override fun load(context: Context) {
        
        registerMainAPI(TwiceflixProvider())
    }
}
