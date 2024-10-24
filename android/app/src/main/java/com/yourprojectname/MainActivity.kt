package com.yourprojectname

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 레이아웃 설정
        val textView = TextView(this).apply {
            text = "Hello, World!"
            textSize = 24f
        }

        // TextView를 ContentView로 설정
        setContentView(textView)
    }
}