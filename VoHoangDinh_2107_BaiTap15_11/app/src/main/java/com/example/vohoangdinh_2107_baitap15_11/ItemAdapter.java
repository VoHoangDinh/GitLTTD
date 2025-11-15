package com.example.vohoangdinh_2107_baitap15_11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<ItemData> items;

    public ItemAdapter(List<ItemData> items) {
        this.items = items;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        ImageView imgItem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            imgItem = itemView.findViewById(R.id.imgItem);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_adapter, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemData item = items.get(position);

        holder.txtName.setText(item.title);

        // Nếu imageRes = 0 nghĩa là không có ảnh → ẩn ImageView
        if (item.imageRes == 0) {
            holder.imgItem.setVisibility(View.GONE);
        } else {
            holder.imgItem.setVisibility(View.VISIBLE);
            holder.imgItem.setImageResource(item.imageRes);
        }
    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}
