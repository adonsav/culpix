package com.example.culpix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.culpix.databinding.ActivityConnectBinding

class ConnectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConnectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@ConnectActivity, R.layout.activity_connect)
        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@ConnectActivity, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}