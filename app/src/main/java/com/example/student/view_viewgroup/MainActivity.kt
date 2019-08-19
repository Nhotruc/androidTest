package com.example.student.view_viewgroup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnClick: Button;
    lateinit var editText: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.btnClick);
        editText = findViewById(R.id.editText);

//        if (btnClick==null){
//            Toast.makeText(this,"eeee",Toast.LENGTH_LONG);
//        }
        btnClick.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,editText.text,Toast.LENGTH_LONG).show()
        })

//        {view -> {
//            Toast.makeText(this,editText?.text,Toast.LENGTH_LONG);
//        }}
    }
}
