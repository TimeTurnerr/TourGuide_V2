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
public class ShimlaFragment extends Fragment {
    public ShimlaFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.Shimla_Place1), getResources().getString(R.string.Shimla_Place1Location),getResources().getString(R.string.Shimla_Place1Description), R.drawable.jakhoo));
        places.add(new Places(getResources().getString(R.string.Shimla_Place2), getResources().getString(R.string.Shimla_Place2Location),getResources().getString(R.string.Shimla_Place2Description), R.drawable.christ_church));
        places.add(new Places(getResources().getString(R.string.Shimla_Place3), getResources().getString(R.string.Shimla_Place3Location),getResources().getString(R.string.Shimla_Place3Description), R.drawable.rashtrapati_niwas));
        places.add(new Places(getResources().getString(R.string.Shimla_Place4), getResources().getString(R.string.Shimla_Place4Location),getResources().getString(R.string.Shimla_Place4Description), R.drawable.iias));
        places.add(new Places(getResources().getString(R.string.Shimla_Place5), getResources().getString(R.string.Shimla_Place5Location),getResources().getString(R.string.Shimla_Place5Description), R.drawable.bantony));
        places.add(new Places(getResources().getString(R.string.Shimla_Place6), getResources().getString(R.string.Shimla_Place6Location),getResources().getString(R.string.Shimla_Place6Description), R.drawable.wax_museum));
        places.add(new Places(getResources().getString(R.string.Shimla_Place7), getResources().getString(R.string.Shimla_Place7Location),getResources().getString(R.string.Shimla_Place7Description), R.drawable.himalayan_bird_park));
        places.add(new Places(getResources().getString(R.string.Shimla_Place8), getResources().getString(R.string.Shimla_Place8Location),getResources().getString(R.string.Shimla_Place8Description), R.drawable.gorton_castle));
        places.add(new Places(getResources().getString(R.string.Shimla_Place9), getResources().getString(R.string.Shimla_Place9Location),getResources().getString(R.string.Shimla_Place9Description), R.drawable.state_museum));
        places.add(new Places(getResources().getString(R.string.Shimla_Place10),getResources().getString(R.string.Shimla_Place10Location),getResources().getString(R.string.Shimla_Place10Description), R.drawable.hawa_ghar));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}
