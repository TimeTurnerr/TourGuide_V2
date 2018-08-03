package com.example.desmond.tourguide;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public class JkFragment extends Fragment {
    public JkFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.JK_Place1), getResources().getString(R.string.JK_Place1Location),getResources().getString(R.string.JK_Place1Description), R.drawable.raghunath_temple));
        places.add(new Places(getResources().getString(R.string.JK_Place2), getResources().getString(R.string.JK_Place2Location),getResources().getString(R.string.JK_Place2Description), R.drawable.chemrey_monastery));
        places.add(new Places(getResources().getString(R.string.JK_Place3), getResources().getString(R.string.JK_Place3Location),getResources().getString(R.string.JK_Place3Description), R.drawable.kardang_monastery));
        places.add(new Places(getResources().getString(R.string.JK_Place5), getResources().getString(R.string.JK_Place5Location),getResources().getString(R.string.JK_Place5Description), R.drawable.pather_masjid));
        places.add(new Places(getResources().getString(R.string.JK_Place6), getResources().getString(R.string.JK_Place6Location),getResources().getString(R.string.JK_Place6Description), R.drawable.amar_mahal_palace));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}
