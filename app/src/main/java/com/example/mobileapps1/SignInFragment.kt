package com.example.mobileapps1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.example.mobileapps1.databinding.FragmentSignInBinding
import com.google.firebase.auth.FirebaseAuth

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    //   private lateinit var auth: FirebaseAuth


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSignInBinding.inflate(layoutInflater)
//        auth = FirebaseAuth.getInstance()

        binding.signIn.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()



            startActivity()
        }

    }

    private fun startActivity() {

    }

}
