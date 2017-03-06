package com.alexfu.fabscrolldemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NumberRecyclerAdapter extends RecyclerView.Adapter<NumberRecyclerViewHolder> {
    @Override
    public NumberRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new NumberRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberRecyclerViewHolder holder, int position) {
        holder.bind(position + 1);
    }

    @Override
    public int getItemCount() {
        return 50;
    }
}
