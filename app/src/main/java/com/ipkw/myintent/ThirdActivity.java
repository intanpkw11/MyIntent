package com.ipkw.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    TextView name;
    Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn_1 = findViewById(R.id.btn1);

        name = findViewById(R.id.names);

        String Names = getIntent().getStringExtra(com.ipkw.myintent.MainActivity.EXTRA_NAMA);

        if (TextUtils.isEmpty(Names)){
            name.setText("Data Belum Dimasukkan");
        } else {
            name.setText("Nama saya " + Names);
        }

    }

    public void MainActivity(View view) {
        Intent main = new Intent(ThirdActivity.this, com.ipkw.myintent.MainActivity.class);
        startActivity(main);
    }

    @Override
    public void onClick(View v) {

    }
}