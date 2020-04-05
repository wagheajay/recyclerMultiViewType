package com.aj.viewtyperecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {

    private ArrayList<data_model> data;
    private Context context;


    public MyAdapter(ArrayList<data_model> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public int getItemViewType(int position) {

        if (data.get(position).getContent_type() == "article") {
            return 0;
        }
        return 1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_article, parent, false);

            return new ArticleHolder(view);
        }

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_video, parent, false);

        return new VideoHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof ArticleHolder)
        {
            ArticleHolder articleHolder = (ArticleHolder) holder;

            articleHolder.title.setText(data.get(position).getTitle());
            articleHolder.description.setText(data.get(position).getDescription());
            articleHolder.type.setText(data.get(position).getContent_type().toUpperCase());
        }
        else
        {
            VideoHolder videoHolder = (VideoHolder) holder;

            videoHolder.title.setText(data.get(position).getTitle());
            videoHolder.description.setText(data.get(position).getDescription());
            videoHolder.type.setText(data.get(position).getContent_type().toUpperCase());

            Glide.with(context).load(data.get(position).getImage()).into(videoHolder.thumbnail);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ArticleHolder extends RecyclerView.ViewHolder {
        TextView title, description, type;


        public ArticleHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_title);
            description = itemView.findViewById(R.id.txt_desc);
            type = itemView.findViewById(R.id.txt_type);
        }
    }

    class VideoHolder extends RecyclerView.ViewHolder {
        TextView title, description, type;
        ImageView thumbnail;

        public VideoHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_title);
            description = itemView.findViewById(R.id.txt_desc);
            type = itemView.findViewById(R.id.txt_type);
            thumbnail = itemView.findViewById(R.id.img_video);

        }
    }
}
