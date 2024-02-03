package com.example.loginactivity

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "5f4742f917e12b3592c2a51e8765ff3d")
    }
}