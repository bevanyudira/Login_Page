package com.example.pertemuan_5_tugas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan_5_tugas.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("EXTRA_USERNAME")
        val jenisKelamin = intent.getStringExtra("EXTRA_JENIS_KELAMIN")
        val noHp = intent.getStringExtra("EXTRA_NO_HP")
        val email = intent.getStringExtra("EXTRA_EMAIL")

        binding.username.text = "Username : " + username
        binding.jenisKelamin.text = "Jenis Kelamin : " + jenisKelamin
        binding.noHp.text = "Nomor Handphone : " + noHp
        binding.email.text = "Email : " + email
    }
}
