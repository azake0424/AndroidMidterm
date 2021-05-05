package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text.*
import java.io.*
import java.lang.StringBuilder

class Text : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        btnView.setOnClickListener {
            val filename="data.txt"

                var fileInputStream:FileInputStream?=null
                fileInputStream=openFileInput(filename)
                var inputStreamReader:InputStreamReader= InputStreamReader(fileInputStream)
                val bufferedReader:BufferedReader=BufferedReader(inputStreamReader)

                val stringBuilder:StringBuilder=StringBuilder()
                var text:String?=null

                while ({text=bufferedReader.readLine();text}()!=null){
                    stringBuilder.append(text)
                }
            editData.setText(stringBuilder.toString()).toString()
        }
    }


}