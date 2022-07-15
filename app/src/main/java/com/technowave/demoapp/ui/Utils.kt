package com.technowave.demoapp.ui

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

import android.widget.EditText

import android.app.Activity




fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}






