package com.example.buoi5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final WordListAdapter mAdapter;
    public ImageView mImgView;
    public TextView mTitleView;
    public TextView mTextView;
    public LinearLayout layout_item;

    public WordViewHolder(View itemView, WordListAdapter adapter){
        super(itemView);
        mImgView = itemView.findViewById(R.id.item_image);
        mTitleView = itemView.findViewById(R.id.item_title);
        mTextView = itemView.findViewById(R.id.item_text);
        layout_item=itemView.findViewById(R.id.layout_item);
        this.mAdapter = adapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
