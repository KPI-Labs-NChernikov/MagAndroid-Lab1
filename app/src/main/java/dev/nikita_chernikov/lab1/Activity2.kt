package dev.nikita_chernikov.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.nikita_chernikov.lab1.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    private var userName: String? = null

    companion object {
        const val USER_NAME_TAG = "userName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        userName = intent.getStringExtra(USER_NAME_TAG)
        if (userName != null)
        {
            binding.userNameTextView.text = getString(R.string.parameter_text, USER_NAME_TAG, userName)
        }
        else
        {
            binding.userNameTextView.text = getString(R.string.unknown_user)
        }
    }
}
