package com.example.fragmentsandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class HotelDetalhesActivity extends AppCompatActivity {

    private final String EXTRA_HOTEL = "hotel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detalhes);

        if (savedInstanceState == null){
            Intent intent = getIntent();
            Hotel hotel = (Hotel) intent.getSerializableExtra(EXTRA_HOTEL);
            HotelDetalheFragment fragment = HotelDetalheFragment.novaInstancia(hotel);
            //Para adicionar esse fragment dinamicamente, é usado a classe FragmentManager() que foi obtido por meio do método getSupportFragmentManager
            //Com esse objeto é iniciado uma nova reansação por usando o beginTransaction, que retornaq um FragmentTransaction, e com o método
            //replace(int, fragment,String) adicionamos o fragmento ao frame Layout. O ultimo paramentro é a tag, que é uma string que identifica esse fragment.
            FragmentManager fragmentManager= getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.detalhe, fragment, HotelDetalheFragment.TAG_DETALHE);
            fragmentTransaction.commit();
        }
    }
}
