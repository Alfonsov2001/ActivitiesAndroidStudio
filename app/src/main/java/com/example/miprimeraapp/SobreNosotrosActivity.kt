package com.example.miprimeraapp

import android.app.Activity
import android.os.Bundle

class SobreNosotrosActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // REQUISITO: Utilizar inflate
        val view = layoutInflater.inflate(R.layout.activity_sobre_nosotros, null)
        setContentView(view)
    }
}
