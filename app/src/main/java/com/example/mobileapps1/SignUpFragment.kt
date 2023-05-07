package com.example.mobileapps1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.example.mobileapps1.databinding.FragmentSignUpBinding
import com.google.firebase.auth.FirebaseAuth


class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding
    private lateinit var auth : FirebaseAuth

    override fun onViewCreated(view : View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSignUpBinding.bind(view)
        auth = FirebaseAuth.getInstance()

        binding.signUp.setOnClickListener {
            val username = binding.username.text.toString()
            val emailText = binding.emailText.text.toString()
            val password = binding.password.text.toString()
            if (
                emailText.isNotEmpty() &&
                username.isNotEmpty()&&
                password.isNotEmpty()
            ) {
                createUser(binding.emailText.text.toString(), binding.username.text.toString())
            }
        }

        binding.signIn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_SignUpFragment_to_SignInFragment)
        }
    }

    private fun createUser(email: String, password: String) {

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful){
                    requireActivity().toast("New User created")

                    Navigation.findNavController(requireView())
                        .navigate(R.id.action_SignUpFragment_to_SignInFragment)

                }
                else{
                    requireActivity().toast(task.exception!!.localizedMessage)
                }
            }
    }
}

private fun FragmentActivity.toast(localizedMessage: String?) {

}
