package com.pernambucosolucoes.easygas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar_left.*
import kotlinx.android.synthetic.main.toolbartext_right.*

class ResisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masterresister_layout)
        configureToolbar()
    }
    private fun configureToolbar(){
        setSupportActionBar(toolbar_left)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar_left.navigationIcon = getDrawable(R.drawable.ic_arrow_back_black_24dp)
        toolbar_right.title = "Cadastrar"
    }
}
