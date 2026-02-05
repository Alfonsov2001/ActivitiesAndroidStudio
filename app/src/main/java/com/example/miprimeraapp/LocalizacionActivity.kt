package com.example.miprimeraapp

import android.app.Activity
import android.os.Bundle

class LocalizacionActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // REQUISITO: Utilizar inflate
        val view = layoutInflater.inflate(R.layout.activity_localizacion, null)
        setContentView(view)
    }
}
