package com.abhishek.tourism;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {
    private ArrayList<Place> places1;
    public PlaceAdapter(ArrayList<Place> places){
        places1=places;
    }
    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item,parent,false);
       PlaceViewHolder pvh=new PlaceViewHolder(v);
       return  pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
    Place p=places1.get(position);
    holder.imgPlace.setImageResource(p.getImage());
    holder.txtName.setText(p.getName());
    holder.txtTicketPrice.setText("$"+p.getTicketPrice());
    }

    @Override
    public int getItemCount() {
       return places1.size();
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgPlace;
        public TextView txtName;
        public TextView txtTicketPrice;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPlace=itemView.findViewById(R.id.imgPlace);
            txtName=itemView.findViewById(R.id.txt1);
            txtTicketPrice=itemView.findViewById(R.id.txt2);

        }
    }
}
