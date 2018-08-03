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
public class AgraFragment extends Fragment {
    public AgraFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.Agra_Place1), getResources().getString(R.string.Agra_Place1Location),getResources().getString(R.string.Agra_Place1Description), R.drawable.taj_mahal));
        places.add(new Places(getResources().getString(R.string.Agra_Place2), getResources().getString(R.string.Agra_Place2Location),getResources().getString(R.string.Agra_Place2Description), R.drawable.agra_fort));
        places.add(new Places(getResources().getString(R.string.Agra_Place3), getResources().getString(R.string.Agra_Place3Location),getResources().getString(R.string.Agra_Place3Description), R.drawable.tomb_of_itimad_ud_daulah));
        places.add(new Places(getResources().getString(R.string.Agra_Place4), getResources().getString(R.string.Agra_Place4Location),getResources().getString(R.string.Agra_Place4Description), R.drawable.akbar_tomb));
        places.add(new Places(getResources().getString(R.string.Agra_Place5), getResources().getString(R.string.Agra_Place5Location),getResources().getString(R.string.Agra_Place5Description), R.drawable.mehtab_bagh));
        places.add(new Places(getResources().getString(R.string.Agra_Place6), getResources().getString(R.string.Agra_Place6Location),getResources().getString(R.string.Agra_Place6Description), R.drawable.moti_masjid));
        places.add(new Places(getResources().getString(R.string.Agra_Place7), getResources().getString(R.string.Agra_Place7Location),getResources().getString(R.string.Agra_Place7Description), R.drawable.jama_masjid));
        places.add(new Places(getResources().getString(R.string.Agra_Place8), getResources().getString(R.string.Agra_Place8Location),getResources().getString(R.string.Agra_Place8Description), R.drawable.tomb_of_mariam_uz_zamani));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}
