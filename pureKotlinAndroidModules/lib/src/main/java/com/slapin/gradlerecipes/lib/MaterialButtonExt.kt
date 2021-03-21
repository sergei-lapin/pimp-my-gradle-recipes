package com.slapin.gradlerecipes.lib

import android.widget.Toast
import com.google.android.material.button.MaterialButton

fun MaterialButton.setupListener() {
    setOnClickListener {
        Toast.makeText(context, "Hello from pure kotlin module", Toast.LENGTH_LONG).show()
    }
}