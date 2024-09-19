package com.example.pertemuan_5_tugas

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan_5_tugas.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("EXTRA_USERNAME")
        val jenis_kelamin = intent.getStringExtra("EXTRA_JENISKELAMIN")
        val no_hp = intent.getStringExtra("EXTRA_NOHP")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val password = intent.getStringExtra("EXTRA_PASSWORD")

        binding.email.text = email
        binding.password.text = password
        binding.password.transformationMethod = PasswordTransformationMethod.getInstance()


        binding.login.setOnClickListener {
            val intentToThirdActivity =
                Intent(this@SecondActivity, ThirdActivity::class.java)
            intentToThirdActivity.putExtra("EXTRA_USERNAME", username)
            intentToThirdActivity.putExtra("EXTRA_JENIS_KELAMIN", jenis_kelamin)
            intentToThirdActivity.putExtra("EXTRA_NO_HP", no_hp)
            intentToThirdActivity.putExtra("EXTRA_EMAIL", email)
            startActivity(intentToThirdActivity)
        }
    }
}
