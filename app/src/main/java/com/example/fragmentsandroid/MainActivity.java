package com.example.fragmentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AoClicarNoHotel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void cliclouNoHotel(Hotel hotel) {
        Intent it = new Intent(MainActivity.this, HotelDetalhesActivity.class);
        it.putExtra(HotelDetalhesActivity.EXTRA_HOTEL, hotel);
        startActivity(it);
    }
}
