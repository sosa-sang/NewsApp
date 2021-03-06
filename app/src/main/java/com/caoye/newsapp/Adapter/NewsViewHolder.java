package com.caoye.newsapp.Adapter;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.caoye.newsapp.Model.News;
import com.caoye.newsapp.R;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by admin on 11/1/16.
 */

public class NewsViewHolder extends BaseViewHolder<News> {
    private TextView mTv_name;
    private ImageView mImg_face;
    private TextView mTv_sign;

    public NewsViewHolder(ViewGroup parent) {
        super(parent, R.layout.news_recycler_item);
        mTv_name = $(R.id.person_name);
        mTv_sign = $(R.id.person_sign);
        mImg_face = $(R.id.person_face);
    }

    @Override
    public void setData(final News data) {
        mTv_name.setText(data.getTitle());
        mTv_sign.setText(data.getCtime());
        Glide.with(getContext())
                .load(data.getPicUrl())
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .into(mImg_face);
    }
}
