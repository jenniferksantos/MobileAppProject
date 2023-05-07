package com.example.mobileapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.mobileapps1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  //  private lateinit var auth: FirebaseAuth
        private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val t = binding.root
        setContentView(t)

//        auth = FirebaseAuth.getInstance()
        binding.shopNow.setOnClickListener {
            val i= Intent(this,SignInFragment::class.java)

            startActivity(i)
        }

        // Change the color of the status bar
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)


    }
}