package com.ehappy.yellowswimmingpants;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ManagerFragment extends Fragment {
    Activity activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        if (getActivity() != null) {
            activity = getActivity();
        }

        View view = inflater.inflate(R.layout.fragment_managers, container, false);
        handleViews(view);
        return view;
    }

//    private class ManagerAdapter extends

    private void handleViews(View view) {
        ListView listView = view.findViewById(R.id.lvManagers);
//        listView
    }
}
