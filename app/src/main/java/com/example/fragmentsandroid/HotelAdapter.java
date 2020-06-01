package com.example.fragmentsandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class HotelAdapter extends BaseAdapter {
    private final List<Hotel> mHotel;
    private final Context context;

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
        View view = LayoutInflater.from(context).inflate(R.layout.item_hoteis, parent, false);
        Hotel hotel = mHotel.get(position);

        TextView nome = view.findViewById(R.id.itens_hotel_nome);
        nome.setText(hotel.getNome());
        TextView endereco = view.findViewById(R.id.itens_hotel_endereco);
        endereco.setText(hotel.getEndereco());
        return null;
    }
}
