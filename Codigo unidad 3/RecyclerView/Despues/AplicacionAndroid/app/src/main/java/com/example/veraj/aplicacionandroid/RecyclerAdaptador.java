package com.example.veraj.aplicacionandroid;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by veraj on 16/01/2016.
 */
public class RecyclerAdaptador  extends RecyclerView.Adapter<RecyclerAdaptador.ViewHolder>{

    List<Fotografia> paisaje;

    RecyclerAdaptador(List<Fotografia> paisaje){
        this.paisaje = paisaje;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView nameAuthor;
        ImageView photo;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.recycler);
            nameAuthor = (TextView)itemView.findViewById(R.id.nameAuthor);
            photo = (ImageView)itemView.findViewById(R.id.imagePhoto);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nameAuthor.setText(paisaje.get(position).nameAuthor);
        holder.photo.setImageResource(paisaje.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return paisaje.size();
    }
}
