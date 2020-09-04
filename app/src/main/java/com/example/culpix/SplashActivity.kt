package com.example.culpix

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.culpix.databinding.ActivitySplashBinding
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var auth: FirebaseAuth
    private val handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@SplashActivity, R.layout.activity_splash)

        auth = FirebaseAuth.getInstance()
        handler.postDelayed({
            val intent: Intent
            if (auth.currentUser == null) {
                intent = Intent(this@SplashActivity, ConnectActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // TODO Call the proper activity when ready
            }
        }, 2000)

    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }

}