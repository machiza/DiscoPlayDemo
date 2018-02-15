package mz.co.hossiman.discoplaydemo.fragmentTop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mz.co.hossiman.discoplaydemo.R;
import mz.co.hossiman.discoplaydemo.model.Musica;

/**
 * Created by secreto on 2/14/18.
 */

public class FragmentHiphop extends Fragment {

    private View view;
    private RecyclerView myrecyclerview;
    private List<Musica> lstMusica;

    public FragmentHiphop() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.top_hiphop_fragment, container, false);
        myrecyclerview = (RecyclerView) view.findViewById(R.id.recyclerViewM);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstMusica);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstMusica = new ArrayList<>();
        lstMusica.add(new Musica("Duas Caras ft Bander", "Quem me dera", "03:57"));
        lstMusica.add(new Musica("Slim Nigga ft Hernani", "Pontas de lanca", "04:07"));
        lstMusica.add(new Musica("Ivete ft Juthe", "Amiga", "03:31"));
        lstMusica.add(new Musica("Dama do Bling ft Liza James", "Boy", "02:57"));
        lstMusica.add(new Musica("Teknik", "Sidekick", "04:14"));
        lstMusica.add(new Musica("Duas Caras ft Bander", "Quem me dera", "03:57"));
        lstMusica.add(new Musica("Slim Nigga ft Hernani", "Pontas de lanca", "04:07"));
        lstMusica.add(new Musica("Ivete ft Juthe", "Amiga", "03:31"));
        lstMusica.add(new Musica("Dama do Bling ft Liza James", "Boy", "02:57"));
        lstMusica.add(new Musica("Teknik", "Sidekick", "04:14"));
    }
}
