package dev.nikita_chernikov.lab1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dev.nikita_chernikov.lab1.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    private var userName: String? = null

    companion object {
        const val USER_NAME_TAG = "userName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
