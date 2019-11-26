package com.pernambucosolucoes.easygas

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import android.text.Layout
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.marginTop
import com.pernambucosolucoes.easygas.R
import kotlinx.android.synthetic.main.content_map.*
import kotlinx.android.synthetic.main.mastertoolbar.*
import kotlinx.android.synthetic.main.toolbar_left.*
import kotlinx.android.synthetic.main.toolbar_without_corners.*
import kotlinx.android.synthetic.main.toolbartext_right.*
import java.security.Permission

class MapActivity : AppCompatActivity() {

    private var LOCATION_PERMITION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        configureToolbar()

        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){

        }else{
            requestLocationPermission()
        }




    }
    private fun requestLocationPermission(){
        val hasLocationPermission = ActivityCompat.checkSelfPermission(this,
            Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

        if (hasLocationPermission) {
            // handle location update
            loadWebview()

        } else {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION), LOCATION_PERMITION)
        }

    }

    override fun onResume() {
        loadWebview()
        super.onResume()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){
            loadWebview()
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
    private fun loadWebview(){
            myWebView.loadUrl("https://www.google.com.br/maps/search/posto+de+combustivel")
            myWebView.settings.javaScriptEnabled = true
    }


    private fun configureToolbar(){
        setSupportActionBar(toolbar_withoutcorner)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar_withoutcorner.navigationIcon = getDrawable(R.drawable.ic_arrow_back_black_24dp)
        toolbar_withoutcorner.title = "Easygas"

    }
}
