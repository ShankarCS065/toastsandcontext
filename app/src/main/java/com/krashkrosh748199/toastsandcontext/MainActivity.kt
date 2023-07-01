package com.krashkrosh748199.toastsandcontext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayoutStates
import com.krashkrosh748199.toastsandcontext.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val btnFirst=findViewById<Button>(R.id.btnShowToast)

        btnFirst.setOnClickListener {
val clFirst=findViewById<ConstraintLayout>(R.id.clToast)
            Toast(this).apply {

                duration = Toast.LENGTH_LONG
                view=layoutInflater.inflate(R.layout.activity_second,clFirst)
                show()

            }
        }

    }
}