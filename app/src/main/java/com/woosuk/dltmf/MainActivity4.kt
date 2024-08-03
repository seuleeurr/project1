package com.woosuk.dltmf

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.woosuk.dltmf.databinding.ActivityMain3Binding
import com.woosuk.dltmf.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding : ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ey8.setOnClickListener {
            // Toast.makeText(this, "헤헤헤를 클릭하셨습니다. ${eeint1+eeint2}", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "정답은 ${(1..20).random()}", Toast.LENGTH_SHORT).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}