package com.example.first_project

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add

class MainActivity : AppCompatActivity() {

    private val TAG:String = "MainActivity"
    private val email:String = "meow@gmail.com"
    private val password:String = "meow_meow_mrr"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val emailInput = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            val passwordInput = findViewById<EditText>(R.id.editTextNumberPassword).text.toString()
            if(email == emailInput && password == passwordInput){
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.add(R.id.root_container, FirstFragment())
                transaction.commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}