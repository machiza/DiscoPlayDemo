package mz.co.hossiman.discoplaydemo.fragmentAlbum;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mz.co.hossiman.discoplaydemo.R;
import mz.co.hossiman.discoplaydemo.model.Album;

/**
 * Created by secreto on 2/14/18.
 */

public class FragmentPandza extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Album> lstAlbuns;

    public FragmentPandza() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.album_pandza_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerViewId);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstAlbuns);
        myrecyclerview.setLayoutManager(new GridLayoutManager(getActivity(),3));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstAlbuns = new ArrayList<>();
        lstAlbuns.add(new Album("Duas Caras","Naphi",R.drawable.thevigitarian,2017,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Micro 2","Caneta e papel",R.drawable.thewildrobot,2008,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Neyma","Idiomas",R.drawable.mariasemples,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Dilon Djindji","xiguindlana",R.drawable.themartian,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Moreira Chonguica","Live At the Polana Serena Hotel",R.drawable.hediedwith,2015,"Jazz",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Jimmy Dludlu","in the groove",R.drawable.privacy,2016,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Duas Caras","Naphi",R.drawable.thevigitarian,2017,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Micro 2","Caneta e papel",R.drawable.thewildrobot,2008,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Neyma","Idiomas",R.drawable.mariasemples,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Dilon Djindji","xiguindlana",R.drawable.themartian,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Moreira Chonguica","Live At the Polana Serena Hotel",R.drawable.hediedwith,2015,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Jimmy Dludlu","in the groove",R.drawable.privacy,2016,"Hip Hop",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Neyma","Idiomas",R.drawable.mariasemples,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Dilon Djindji","xiguindlana",R.drawable.themartian,2015,"Marrabenta",getString(R.string.albumDescription)));
        lstAlbuns.add(new Album("Moreira Chonguica","Live At the Polana Serena Hotel",R.drawable.hediedwith,2015,"Hip Hop",getString(R.string.albumDescription)));

    }
}
