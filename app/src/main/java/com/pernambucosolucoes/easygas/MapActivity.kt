package com.pernambucosolucoes.easygas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import android.text.Layout
import android.view.View
import android.widget.Toolbar
import androidx.core.view.marginTop
import com.pernambucosolucoes.easygas.R
import kotlinx.android.synthetic.main.content_map.*
import kotlinx.android.synthetic.main.mastertoolbar.*
import kotlinx.android.synthetic.main.toolbar_left.*
import kotlinx.android.synthetic.main.toolbar_without_corners.*
import kotlinx.android.synthetic.main.toolbartext_right.*

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        configureToolbar()
        myWebView.loadUrl("https://www.google.com.br/maps/search/posto+de+combust%C3%ADvel/")
        myWebView.settings.javaScriptEnabled = true

    }
    private fun configureToolbar(){
        setSupportActionBar(toolbar_withoutcorner)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar_withoutcorner.navigationIcon = getDrawable(R.drawable.ic_arrow_back_black_24dp)
        toolbar_withoutcorner.title = "Easygas"

    }
}
