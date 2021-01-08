package com.ipkw.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNama, tvInstitusi;
    Button btnAct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);
        btnAct3 = findViewById(R.id.btn_activity3);
        btnAct3.setOnClickListener(this);

        String nama = getIntent().getStringExtra(com.ipkw.myintent.MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(com.ipkw.myintent.MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)){
            tvNama.setText("Data Belum Dimasukkan");
        } else {
            tvNama.setText("Nama         : " + nama);
        }

        if (TextUtils.isEmpty(institusi)){
            tvInstitusi.setText("Data Belum Dimasukkan");
        } else {
            tvInstitusi.setText("Institusi     : " + institusi);
        }

    }

    @Override
    public void onClick(View v) {
        pindahAct3();
    }

    private void pindahAct3() {
        String name = getIntent().getStringExtra(com.ipkw.myintent.MainActivity.EXTRA_NAMA);
        Intent act3 = new Intent(SecondActivity.this, com.ipkw.myintent.ThirdActivity.class);

        act3.putExtra(com.ipkw.myintent.MainActivity.EXTRA_NAMA, name);

        startActivity(act3);
    }
}