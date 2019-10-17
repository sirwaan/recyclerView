package com.sirwansoft.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<ModelRecycler> lstItems;

    public RecyclerViewAdapter(Context mContext, List<ModelRecycler> lstItems) {
        this.mContext = mContext;
        this.lstItems = lstItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        //in main activity displays
        holder.title.setText(lstItems.get(position).getTitle());

        holder.imageView.setImageResource(lstItems.get(position).getPicture());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return lstItems.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView_in_recyclerViewModel);
            imageView = itemView.findViewById(R.id.image_view_in_recyclerViewModel);
            cardView = itemView.findViewById(R.id.cardView_in_recyclerViewModel);


        }
    }

}
