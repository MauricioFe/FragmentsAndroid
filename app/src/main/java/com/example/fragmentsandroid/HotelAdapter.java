package com.example.fragmentsandroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class HotelAdapter extends BaseAdapter {
    HotelListFragment listFragment = new HotelListFragment();
    List<Hotel> mHotel = listFragment.mHoteis;

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
        return null;
    }
}
