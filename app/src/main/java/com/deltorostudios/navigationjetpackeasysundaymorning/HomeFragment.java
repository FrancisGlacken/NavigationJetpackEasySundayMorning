package com.deltorostudios.navigationjetpackeasysundaymorning;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javax.xml.namespace.NamespaceContext;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        Button changeButton = view.findViewById(R.id.toAlternateFragmentButton);
        CustomObject object = new CustomObject(1, "Fran", "Good looking");

        // Convenience method
        //changeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_alternateFragment, null));

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "Let's gooooooo champ!!";

                HomeFragmentDirections.ToSettingsAction action = HomeFragmentDirections.toSettingsAction();
                action.setReceiveStringArg(info);
                Navigation.findNavController(view).navigate(action);
            }
        });
        return view;
    }
}
