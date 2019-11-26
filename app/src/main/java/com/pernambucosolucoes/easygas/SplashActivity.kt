package com.pernambucosolucoes.easygas

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_splash.*
import java.lang.reflect.Array

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
        btn_go_to_map.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }

    }




}
