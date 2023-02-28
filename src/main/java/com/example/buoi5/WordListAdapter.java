package com.example.buoi5;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {

    private final LayoutInflater mInflater;
    private Context mcontext;
    private LinkedList<ViewItem> mWordList = new LinkedList<ViewItem>();

    public WordListAdapter(Context context, LinkedList<ViewItem> wordlist) {
        mInflater = LayoutInflater.from(context);
        this.mcontext = context;
        this.mWordList = wordlist;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemview = mInflater.inflate(R.layout.item_layout, parent, false);
        return new WordViewHolder(mItemview, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        ViewItem item = mWordList.get(position);
        holder.mImgView.setImageResource(item.getImgId());
        holder.mTitleView.setText(item.getTitle());
        holder.mTextView.setText(item.getText());
        holder.layout_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, Item_Detail.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("text",item);
                intent.putExtras(bundle);
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
