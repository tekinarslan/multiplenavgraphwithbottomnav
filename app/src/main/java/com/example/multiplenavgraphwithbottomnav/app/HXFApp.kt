package com.example.multiplenavgraphwithbottomnav.app

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HXFApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}
