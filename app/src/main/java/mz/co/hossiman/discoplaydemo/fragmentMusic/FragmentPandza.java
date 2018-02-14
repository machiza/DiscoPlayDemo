package mz.co.hossiman.discoplaydemo.fragmentMusic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mz.co.hossiman.discoplaydemo.R;

/**
 * Created by secreto on 2/13/18.
 */

public class FragmentPandza extends Fragment {

    View view;

    public FragmentPandza() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.music_pandza_fragment, container, false);

        return view;
    }
}
