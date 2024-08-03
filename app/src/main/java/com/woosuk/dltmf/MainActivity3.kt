package com.woosuk.dltmf

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.woosuk.dltmf.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding : ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding 3줄 -> 변수 ev1~ev3을 결합해서 코딩 작성을 최소화 함(?)



        binding.chek1.setOnClickListener {
           // Toast.makeText(this, "헤헤헤를 클릭하셨습니다. ${eeint1+eeint2}", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "헤헤헤를 클릭하셨습니다.", Toast.LENGTH_SHORT).show()
        }
        binding.chek3.setOnClickListener {
            Toast.makeText(this,"sss",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity4::class.java))
        }
        // var view = LayoutInflater.from(this).inflate(R.layout.activity_main3,null,false)
       // setContentView(R.layout.activity_main3)
        var ey1 = findViewById<EditText>(R.id.ey1)
        var ey2 = findViewById<EditText>(R.id.ey2)
        var button = findViewById<Button>(R.id.ey3)
        //button.setOnClickListener {
           // Toast.makeText(this,"${ey1.text}  토스트가 띄어졌어요.",Toast.LENGTH_SHORT).show()


       //}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}