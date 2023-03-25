package com.game.daggerhiltdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltTag"

@HiltAndroidApp
class DaggerHiltDemoApp : Application() {
}