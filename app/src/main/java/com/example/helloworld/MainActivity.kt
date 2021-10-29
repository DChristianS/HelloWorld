package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn: Button
    private lateinit var tv: TextView
    private lateinit var tv2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn_1)
        // Java: Button btn = (Button) findViewById(R.id.btn_1);
        tv = findViewById(R.id.tv_1)
        tv2 = findViewById(R.id.textView2)


        btn.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        tv.text = "Du hast mich geklickt"
        tv2.text = "";
    }
}
