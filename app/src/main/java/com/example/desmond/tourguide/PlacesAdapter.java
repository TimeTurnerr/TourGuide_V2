package com.example.desmond.tourguide;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {
    private List<Places> plc;
    private Context context;
    public PlacesAdapter(Context context, List<Places> plc) {
        this.context = context;
        this.plc = plc;
    }

    @NonNull
    @Override
    public PlacesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater
                        .from(context)
                        .inflate(R.layout.list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Places currentplaces = plc.get(position);
        holder.nameTextView.setText(currentplaces.getmName());
        holder.locationTextView.setText(currentplaces.getmLocation());
        holder.image.setImageResource(currentplaces.getImageResourceId());
        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = currentplaces.getmName();
                String location = currentplaces.getmLocation();
                int imgid = currentplaces.getImageResourceId();
                String description = currentplaces.getmdescription();
                Bundle bundle = new Bundle();
                bundle.putInt("Image", imgid);
                bundle.putString("Name", name);
                bundle.putString("Location", location);
                bundle.putString("Description", description);
                Intent detailIntent = new Intent(context, DetailsActivity.class);
                detailIntent.putExtras(bundle);
                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.plc.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;
        private TextView locationTextView;
        private ImageView image;
        private View parentView;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.parentView = view;
            this.nameTextView = (TextView)view.findViewById(R.id.Name);
            this.locationTextView = (TextView)view.findViewById(R.id.location);
            this.image = (ImageView) view.findViewById(R.id.image);
        }
    }
}