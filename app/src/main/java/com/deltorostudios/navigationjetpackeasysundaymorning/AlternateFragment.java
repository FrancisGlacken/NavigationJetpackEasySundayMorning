package com.deltorostudios.navigationjetpackeasysundaymorning;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;

public class AlternateFragment extends Fragment {

    public AlternateFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.alternate_fragment, container, false);
        Button changeButton = view.findViewById(R.id.toHomeFragmentButton);

        changeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_alternateFragment_to_homeFragment, null));
        return view;
    }
}
