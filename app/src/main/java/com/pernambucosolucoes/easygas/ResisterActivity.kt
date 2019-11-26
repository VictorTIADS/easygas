package com.pernambucosolucoes.easygas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_resister.*
import kotlinx.android.synthetic.main.toolbar_left.*
import kotlinx.android.synthetic.main.toolbartext_right.*

class ResisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masterresister_layout)
        configureToolbar()
        btn_sign_up_user.setOnClickListener {
           validate()
        }
    }

    private fun configureToolbar() {
        setSupportActionBar(toolbar_left)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar_left.navigationIcon = getDrawable(R.drawable.ic_arrow_back_black_24dp)
        toolbar_right.title = "Cadastrar"
    }

    private fun validate() {
        if (edit_resister_name.text.isEmpty()) {
            edit_resister_name.error = "Campo Obrigatório"
        }
        if (edit_resister_email.text.isEmpty()) {
            edit_resister_email.error = "Campo Obrigatório"
        }
        if (edit_resister_password.text.isEmpty()) {
            edit_resister_password.error = "Campo Obrigatório"
        }
        if (edit_resister_confirm_password.text.isEmpty()) {
            edit_resister_confirm_password.error = "Campo Obrigatório"
        }
        if (edit_resister_name.text.isNotEmpty() && edit_resister_email.text.isNotEmpty() && edit_resister_password.text.isNotEmpty() && validatePassword(edit_resister_password, edit_resister_confirm_password)) {
            startActivity(Intent(this, SuccessfulResisterActivity::class.java))
        }
    }

    private fun validatePassword(ed1: EditText, ed2: EditText): Boolean {
        return when {
            ed1.text != ed2.text -> {
                true
            }
            else -> {

                Toast.makeText(this, "As senhas não coincidem", Toast.LENGTH_LONG).show()
                false
            }
        }

    }
}
