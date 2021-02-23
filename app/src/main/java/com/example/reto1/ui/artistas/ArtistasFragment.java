package com.example.reto1.ui.artistas;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.reto1.R;
import com.example.reto1.adaptador.ArtistaAdapter;
import com.example.reto1.model.Artista;
import com.example.reto1.model.Cancion;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistasFragment extends Fragment {

    @BindView(R.id.lista_artistas)
    ListView listViewArtista;
    private List<Artista> artistas;
    private List<Cancion> canciones;
    EditText editText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_artistas, container, false);
        ButterKnife.bind(this,root);
        cargarInformacion();
        ArtistaAdapter artistaAdapter = new ArtistaAdapter(getContext(), artistas);
        listViewArtista.setAdapter(artistaAdapter);
        editTextWatcher(artistaAdapter);


        return root;
    }
    private void editTextWatcher(ArtistaAdapter artistaAdapter){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void cargarInformacion() {
        artistas = new ArrayList<>(5);
        artistas.add(new Artista(R.drawable.beatles, getString(R.string.beatles), getString(R.string.poprock)));
        artistas.add(new Artista(R.drawable.blackpinck,getString(R.string.blackpink), getString(R.string.kpop)));
        artistas.add(new Artista(R.drawable.bts,getString(R.string.bts), getString(R.string.kpop)));
        artistas.add(new Artista(R.drawable.katanazero,getString(R.string.katanazero), getString(R.string.electro)));
        artistas.add(new Artista(R.drawable.camilosesto,getString(R.string.camilosesto), getString(R.string.romantica)));



    }

}