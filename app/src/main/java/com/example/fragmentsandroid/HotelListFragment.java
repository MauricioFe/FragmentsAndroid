package com.example.fragmentsandroid;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class HotelListFragment extends ListFragment {
    private List<Hotel> mHoteis;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mHoteis = CarregarHoteis();
        HotelAdapter hotelAdapter = new HotelAdapter(mHoteis, getActivity());
        setListAdapter(hotelAdapter);
    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Activity activity = getActivity();
        if (activity instanceof AoClicarNoHotel){
            Hotel hotel = (Hotel)l.getItemAtPosition(position);
            AoClicarNoHotel listener = (AoClicarNoHotel)activity;
            listener.cliclouNoHotel(hotel);
        }
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
