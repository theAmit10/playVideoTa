package com.example.playvideota.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playvideota.R;
import com.example.playvideota.model.YoutuberModel;

import java.util.ArrayList;

public class YoutuberAdapter extends RecyclerView.Adapter<YoutuberAdapter.viewHolder> {

    Context context;
    ArrayList<YoutuberModel> list;

    public YoutuberAdapter(Context context, ArrayList<YoutuberModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_design_youtuber,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        YoutuberModel youtuberModel = list.get(position);
        holder.youtuberImage.setImageResource(youtuberModel.getYoutuberImage());
        holder.youtuberName.setText(youtuberModel.getYoutuberName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView youtuberImage;
        TextView youtuberName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            youtuberImage = itemView.findViewById(R.id.yotuberProfile);
            youtuberName = itemView.findViewById(R.id.youtuberName);
        }
    }
}