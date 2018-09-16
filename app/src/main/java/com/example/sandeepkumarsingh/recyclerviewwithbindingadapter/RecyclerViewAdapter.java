package com.example.sandeepkumarsingh.recyclerviewwithbindingadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sandeepkumarsingh.recyclerviewwithbindingadapter.databinding.SportDataBinding;

import java.util.ArrayList;

/**
 * Created by sandeepkumarsingh on 2/18/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context mContext;
    private ArrayList<SportViewModel> mList;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, ArrayList<SportViewModel> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(inflater == null){
            inflater = LayoutInflater.from(parent.getContext());
        }
        SportDataBinding dataBinding = SportDataBinding.inflate(inflater,parent,false);
        return new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SportViewModel model = mList.get(position);
        holder.bind(model);

        final SportDataBinding dataBinding = holder.getmDataBinding();
        dataBinding.setHandler(new FavImgCickHandler() {
            @Override
            public void onFavImgClick() {
                //if(model.imgSrcId == R.drawable.ic_launcher_background) {
                    model.imgSrcId.set(R.drawable.ic_launcher_foreground);
                    Toast.makeText(mContext, "removed---", Toast.LENGTH_SHORT).show();


            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
