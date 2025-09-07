package dev.nikita_chernikov.lab1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.nikita_chernikov.lab1.databinding.Activity1Binding
class Activity1 : AppCompatActivity() {
    private lateinit var binding: Activity1Binding
    private val userName: String = "Черніков"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val startActivity2Intent = Intent(this, Activity2::class.java)
            startActivity2Intent.putExtra(Activity2.USER_NAME_TAG, userName)
            startActivity(startActivity2Intent)
        }
    }
}
