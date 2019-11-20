package com.pernambucosolucoes.easygas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lblSignUpUserGoToForm.setOnClickListener {
            startActivity(Intent(this,ResisterActivity::class.java))
        }
        btn_login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}
