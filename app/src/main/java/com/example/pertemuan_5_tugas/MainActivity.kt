package com.example.pertemuan_5_tugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan_5_tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding) {
            signup.setOnClickListener {
                val intenToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)

                intenToSecondActivity.putExtra("EXTRA_USERNAME", username.text.toString())
                intenToSecondActivity.putExtra("EXTRA_JENISKELAMIN", jenisKelamin.text.toString())
                intenToSecondActivity.putExtra("EXTRA_NOHP", noHp.text.toString())
                intenToSecondActivity.putExtra("EXTRA_EMAIL", email.text.toString())
                intenToSecondActivity.putExtra("EXTRA_PASSWORD", password.text.toString())
                startActivity(intenToSecondActivity)
            }
        }
    }
}