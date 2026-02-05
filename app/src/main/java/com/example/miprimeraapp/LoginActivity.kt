package com.example.miprimeraapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // REQUISITO: Utilizar inflate en lugar de setContentView(R.layout...)
        val view = layoutInflater.inflate(R.layout.activity_login, null)
        setContentView(view)

        val etUsuario = view.findViewById<EditText>(R.id.etUsuario)
        val etPassword = view.findViewById<EditText>(R.id.etPassword)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val password = etPassword.text.toString()

            if (usuario.isNotEmpty() && password.isNotEmpty()) {
                // Navegar a Activity 2: Inicio, pasando el usuario
                val intent = Intent(this, InicioActivity::class.java)
                intent.putExtra("USERNAME", usuario)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor ingrese usuario y contraseña", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
