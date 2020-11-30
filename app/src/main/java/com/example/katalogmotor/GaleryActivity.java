package com.example.katalogmotor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.katalogmotor.model.Motor;

import java.util.List;

public class GaleryActivity extends AppCompatActivity {


    List<Motor> motors;
    int indeksTampil = 0;
    String merkMotor;
    Button btnPertama, btnTerakhir, btnSebelumnya, btnBerikutnya;
    TextView txDeskripsi, txJudul, txType;
    ImageView ivFotoLaptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Intent intent = getIntent();
        merkMotor = intent.getStringExtra(MainActivity.SERIES_GALERI_KEY);
        motors = DataProvider.getMotorsbytipe(this, merkMotor);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> LaptopPertama());
        btnTerakhir.setOnClickListener(view -> LaptopTerakhir());
        btnSebelumnya.setOnClickListener(view -> LaptopSebelumnya());
        btnBerikutnya.setOnClickListener(view -> LaptopBerikutnya());


        txType = findViewById(R.id.txType);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoLaptop = findViewById(R.id.gambarMotor);
        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Katalog Motor " + merkMotor);
    }


    private void tampilkanProfil() {
        Motor k = motors.get(indeksTampil);
        Log.d("ACER", "Menampilkan acer " + k.getMerk());
        txType.setText(k.getType());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoLaptop.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void LaptopPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void LaptopTerakhir() {
        int posAkhir = motors.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void LaptopBerikutnya() {
        if (indeksTampil == motors.size() - 1) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void LaptopSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }

}