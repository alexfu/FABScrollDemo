package com.alexfu.fabscrolldemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NumberRecyclerViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public NumberRecyclerViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(android.R.id.text1);
    }

    public void bind(int i) {
        textView.setText(String.valueOf(i));
    }
}
