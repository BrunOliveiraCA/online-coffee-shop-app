package com.binaryleaf.online_coffee_shop_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class IntroActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
    }
}