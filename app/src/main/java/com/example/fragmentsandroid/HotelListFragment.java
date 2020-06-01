package com.example.fragmentsandroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class HotelListFragment extends ListFragment {
    List<Hotel> mHoteis;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mHoteis = CarregarHoteis();
    }

    private List<Hotel> CarregarHoteis() {
        List<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("New Beach Hotel", "Av. Boa Viagem", 4.5f));
        hotels.add(new Hotel("Recife Hotel", "Av. Boa Viagem", 4.0f));
        hotels.add(new Hotel("Canario Hotel", "Rua dos Navegantes", 3.0f));
        hotels.add(new Hotel("Byanca Beach Hotel", "Rua Mamanguape", 4.0f));
        hotels.add(new Hotel("Grand Hotel Dor", "Av. Bernardo", 3.5f));
        hotels.add(new Hotel("Hotel Cool", "Av. Conselheiro Aguiar", 4.0f));
        hotels.add(new Hotel("Hotel Infinito", "Rua Ribeiro de Brito", 5.0f));
        hotels.add(new Hotel("Hotel Tulipa", "Av. Boa Viagem", 5.0f));
        return hotels;
    }
}
