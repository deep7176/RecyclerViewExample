package com.example.app.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deep on 4/30/16.
 * this class is the adapter class for the recycler view it's responsible for providing data to the
 * recyclerview and managing the data displayed on screen
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {

    private List<String> mData = new ArrayList<>();

    public RecyclerAdapter() {
        //constructor
    }

    @Override
    public RecyclerAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View v = inflater.inflate(R.layout.list_item_sample, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ItemViewHolder holder, int position) {
        //TODO set values to the viewholder here
        //TODO handle click events here
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{

        public ItemViewHolder(View itemView) {
            super(itemView);
            // itemView is the view that you inflate in onCreateViewHolder()
            // in this case it's list_item_sample.xml
            //TODO get views from list root view here
        }
    }
}
