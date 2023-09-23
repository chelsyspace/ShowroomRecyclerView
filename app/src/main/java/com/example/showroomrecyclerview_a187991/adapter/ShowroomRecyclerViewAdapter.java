package com.example.showroomrecyclerview_a187991.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.showroomrecyclerview_a187991.R;
import com.example.showroomrecyclerview_a187991.Showroom;
import com.example.showroomrecyclerview_a187991.ShowroomDetailActivity;

import java.util.List;

public class ShowroomRecyclerViewAdapter extends RecyclerView.Adapter<ShowroomRecyclerViewAdapter.ShowroomViewHolder>{

    public List<Showroom> showroomList;
    private Context context;

    public ShowroomRecyclerViewAdapter(Context context, List<Showroom> showroomList) {
        this.context = context;
        this.showroomList = showroomList;
    }

    @NonNull

    @Override
    public ShowroomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View showroom_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.showroom_row,null);

        ShowroomViewHolder showroomVH = new ShowroomViewHolder(showroom_row);
        return showroomVH;
    }

    @Override
    public void onBindViewHolder(@NonNull ShowroomViewHolder holder, int position) {

        holder.tvShowroomName.setText(showroomList.get(position).getName());
        holder.imgShowroomImage.setImageResource(showroomList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return showroomList.size();
    }

    public class ShowroomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvShowroomName;
        public ImageView imgShowroomImage;

        public ShowroomViewHolder(View itemView) {
            super(itemView);
            tvShowroomName = itemView.findViewById(R.id.tv_showroom_name);
            imgShowroomImage = itemView.findViewById(R.id.img_showroom);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Model Name: " + showroomList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), ShowroomDetailActivity.class);
            intent.putExtra("showroomName", showroomList.get(getAdapterPosition()).getName());

            view.getContext().startActivity(intent);
        }
    }
}
