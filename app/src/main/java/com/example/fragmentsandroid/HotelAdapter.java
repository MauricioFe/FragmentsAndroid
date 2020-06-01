package com.example.fragmentsandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class HotelAdapter extends BaseAdapter {
    private final List<Hotel> mHotel; //cria-se sempre uma lista
    private final Context context; //e uma variavel context

    public HotelAdapter(List<Hotel> mHotel, Context context) {
        this.mHotel = mHotel;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mHotel.size();
    }

    @Override
    public Object getItem(int position) {
        return mHotel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hoteis, parent, false);//inflar a view
        Hotel hotel = mHotel.get(position);//pegar a posição da lista

        mostrarNome(view, hotel);//inicializar os componentes
        mostrarEndereco(view, hotel);
        return view;
    }

    private void mostrarEndereco(View view, Hotel hotel) {
        TextView endereco = view.findViewById(R.id.itens_hotel_endereco);
        endereco.setText(hotel.getEndereco());
    }

    private void mostrarNome(View view, Hotel hotel) {
        TextView nome = view.findViewById(R.id.itens_hotel_nome);
        nome.setText(hotel.getNome());
    }
}
