package com.example.miprimeraapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ContactoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // REQUISITO: Utilizar inflate
        val view = layoutInflater.inflate(R.layout.activity_contacto, null)
        setContentView(view)

        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val etEmail = view.findViewById<EditText>(R.id.etEmail)
        val etMensaje = view.findViewById<EditText>(R.id.etMensaje)
        val btnEnviar = view.findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val email = etEmail.text.toString()
            val mensaje = etMensaje.text.toString()

            if (nombre.isNotEmpty() && email.isNotEmpty() && mensaje.isNotEmpty()) {
                val intentData = Intent()
                intentData.putExtra("NOMBRE", nombre)
                intentData.putExtra("EMAIL", email)
                intentData.putExtra("MENSAJE", mensaje)
                
                // Enviar datos de vuelta (SetResult)
                setResult(RESULT_OK, intentData)
                finish() // Cierra esta actividad y regresa a InicioActivity
            } else {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
