package com.veiga.first_app

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.preference.PreferenceManager
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private val campoNome: TextInputEditText by lazy { findViewById(R.id.campo_nome) }
    private val botaoContinuar: Button by lazy { findViewById(R.id.botao_continuar) }
//    private val changeThemeButton: Button by lazy { findViewById(R.id.change_theme_button) }

    //    private val exibirMensagem:Button by lazy { findViewById(R.id.exibir_mensagem) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Evento do botão
        botaoContinuar.setOnClickListener {
            Toast.makeText(this, "Seja bem vindo, ${campoNome.text}!! :))", Toast.LENGTH_LONG)
                .show()
            // Intenção do app
            val intent = Intent(this, LifeCycleActivities::class.java)
            startActivity(intent)
        }

//        changeThemeButton.setOnKeyListener {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//        }



    }
}