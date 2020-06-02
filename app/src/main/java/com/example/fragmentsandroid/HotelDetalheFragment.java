package com.example.fragmentsandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HotelDetalheFragment extends Fragment {
    private static String EXTRA_HOTEL = "hotel";
    private final String TAG_DETALHE = "tagDetalhe";


    TextView nomeHotel;
    TextView enderecoHotel;
    RatingBar estrlasHotel;

    Hotel hotel;
// esse é o chamado método construtor, foi criado para podermos ter uma nova instancia da classe que receba o hotel
//Não foi utilizado o construtor da classe pq a plataforma obriga que o construtor não receba parâmetros
    public static HotelDetalheFragment novaInstancia(Hotel hotel) {
        //Passando o hotel detro do bundle. Se o intent armazena os parametros internamento em um objeto Bundle o fragment
        //faz a mesma coisa. Então foi armazenado o objeto hotel na variavel parametros e em seguida instanciei
        //o fragment setando os argumentos.
        Bundle parametros = new Bundle();
        parametros.putSerializable(EXTRA_HOTEL, hotel);

        HotelDetalheFragment fragment = new HotelDetalheFragment();
        fragment.setArguments(parametros);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Nessa etapa eu peguei os argutmentos inicializados no método construtor
        hotel = (Hotel) getArguments().getSerializable(EXTRA_HOTEL);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalhe_hotel, container, false);
        nomeHotel = view.findViewById(R.id.detalhe_hotel_txtNome);
        enderecoHotel = view.findViewById(R.id.detalhe_hotel_txtEndereco);
        estrlasHotel = view.findViewById(R.id.detalhe_hotel_rtbEstrelas);
        if (hotel != null){
            nomeHotel.setText(hotel.getNome());
            enderecoHotel.setText(hotel.getEndereco());
            estrlasHotel.setRating(hotel.getEstrelas());
        }
        return view;
    }
}
