package com.example.miprimeraapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InicioActivity : Activity() {

    private lateinit var tvResultadoContacto: TextView

    companion object {
        const val REQUEST_CODE_CONTACTO = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // REQUISITO: Utilizar inflate
        val view = layoutInflater.inflate(R.layout.activity_inicio, null)
        setContentView(view)

        // Recuperar usuario del Login
        val usuario = intent.getStringExtra("USERNAME")
        val tvBienvenida = view.findViewById<TextView>(R.id.tvBienvenida)
        tvBienvenida.text = "Bienvenido, $usuario"

        tvResultadoContacto = view.findViewById(R.id.tvResultadoContacto)

        val btnContacto = view.findViewById<Button>(R.id.btnContacto)
        val btnSobreNosotros = view.findViewById<Button>(R.id.btnSobreNosotros)
        val btnLocalizacion = view.findViewById<Button>(R.id.btnLocalizacion)

        btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            // Usamos startActivityForResult para esperar respuesta
            startActivityForResult(intent, REQUEST_CODE_CONTACTO)
        }

        btnSobreNosotros.setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        btnLocalizacion.setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }

    // Recibir datos de Contacto
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_CONTACTO && resultCode == RESULT_OK) {
            val nombre = data?.getStringExtra("NOMBRE")
            val email = data?.getStringExtra("EMAIL")
            val mensaje = data?.getStringExtra("MENSAJE")

            tvResultadoContacto.text = "Datos Recibidos:\nNombre: $nombre\nEmail: $email\nMensaje: $mensaje"
        }
    }
}
