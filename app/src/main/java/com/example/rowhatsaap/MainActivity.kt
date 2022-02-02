package com.example.rowhatsaap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private EditText mPhoneNumber, mcode;
    private Button mSend;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mPhoneNumber = findViewById(R.id.PhoneNumber);
        mcode = findViewById(R.id.Code);
        msend = findViewById(R.id.send);

    }
}
