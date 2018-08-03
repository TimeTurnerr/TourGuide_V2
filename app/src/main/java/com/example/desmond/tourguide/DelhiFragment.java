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
public class DelhiFragment extends Fragment {
    public DelhiFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.Delhi_Place1), getResources().getString(R.string.Delhi_Place1Location),getResources().getString(R.string.Delhi_Place1Description), R.drawable.red_fort));
        places.add(new Places(getResources().getString(R.string.Delhi_Place2), getResources().getString(R.string.Delhi_Place2Location),getResources().getString(R.string.Delhi_Place2Description), R.drawable.qutub_minar));
        places.add(new Places(getResources().getString(R.string.Delhi_Place3), getResources().getString(R.string.Delhi_Place3Location),getResources().getString(R.string.Delhi_Place3Description), R.drawable.india_gate));
        places.add(new Places(getResources().getString(R.string.Delhi_Place4), getResources().getString(R.string.Delhi_Place4Location),getResources().getString(R.string.Delhi_Place4Description), R.drawable.jamamasjid));
        places.add(new Places(getResources().getString(R.string.Delhi_Place5), getResources().getString(R.string.Delhi_Place5Location),getResources().getString(R.string.Delhi_Place5Description), R.drawable.humayun_tomb));
        places.add(new Places(getResources().getString(R.string.Delhi_Place6), getResources().getString(R.string.Delhi_Place6Location),getResources().getString(R.string.Delhi_Place6Description), R.drawable.lotus_temple));
        places.add(new Places(getResources().getString(R.string.Delhi_Place7), getResources().getString(R.string.Delhi_Place7Location),getResources().getString(R.string.Delhi_Place7Description), R.drawable.akshardham));
        places.add(new Places(getResources().getString(R.string.Delhi_Place8), getResources().getString(R.string.Delhi_Place8Location),getResources().getString(R.string.Delhi_Place8Description), R.drawable.purana_qila));
        places.add(new Places(getResources().getString(R.string.Delhi_Place9), getResources().getString(R.string.Delhi_Place9Location),getResources().getString(R.string.Delhi_Place9Description), R.drawable.jantar_mantar));
        places.add(new Places(getResources().getString(R.string.Delhi_Place10),getResources().getString(R.string.Delhi_Place10Location),getResources().getString(R.string.Delhi_Place10Description), R.drawable.lakshmi_narayan_temple));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}
