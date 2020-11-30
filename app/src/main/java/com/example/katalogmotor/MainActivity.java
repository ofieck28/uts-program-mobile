package com.example.katalogmotor;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHonda,btnSuzuki,btnYamaha;
    public static final String SERIES_GALERI_KEY = "SERIES_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnHonda = findViewById(R.id.btn_buka_type_Honda);
        btnSuzuki = findViewById(R.id.btn_buka_type_Suzuki);
        btnYamaha= findViewById(R.id.btn_buka_type_Yamaha);
        btnHonda.setOnClickListener(view -> bukaGaleri("Honda"));
        btnSuzuki.setOnClickListener(view -> bukaGaleri("Suzuki"));
        btnYamaha.setOnClickListener(view -> bukaGaleri("Yamaha"));
    }

    private void bukaGaleri(String merkMotor) {
        Log.d("MAIN","Buka activity Honda");
        Intent intent = new Intent(this,GaleryActivity.class);
        intent.putExtra(SERIES_GALERI_KEY, merkMotor);
        startActivity(intent);
    }
}