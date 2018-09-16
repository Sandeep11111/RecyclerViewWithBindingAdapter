package com.example.sandeepkumarsingh.recyclerviewwithbindingadapter;

import android.support.v7.widget.RecyclerView;

import com.example.sandeepkumarsingh.recyclerviewwithbindingadapter.databinding.SportDataBinding;

/**
 * Created by sandeepkumarsingh on 2/18/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private SportDataBinding mDataBinding;

    public ViewHolder(SportDataBinding dataBinding) {
        super(dataBinding.getRoot());
        mDataBinding = dataBinding;
    }

    public void bind(SportViewModel model){
        this.mDataBinding.setViewModel(model);
    }

    public SportDataBinding getmDataBinding() {
        return mDataBinding;
    }
}
