package com.example.javier.planet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;


public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{
    Context mctc;
    List<Planet> planetList;


    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent.int viewType){
        LayoutInflater inflater = LayoutInflater.from(mctc);
        View v = inflater.inflate(R.layout.list_layout. parent());
            return new PlanetViewHolder(v);
    }

    @Override
    public void onFindViewHolder(PlanetViewHolder holder, int position){
        holder.title.setText(planetList.get(position).getTitle());
        holder.img.setImageResource
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView title, description;
        public PlanetViewHolder (View itemView){
            super(itemView);

            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }

}
