package com.mindnotix.mvp_base_retrofit.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mindnotix.mvp_base_retrofit.R;
import com.mindnotix.mvp_base_retrofit.adapter.listener.IBaseCallback;
import com.mindnotix.mvp_base_retrofit.model.User;

import java.util.List;

/**
 * Created by Admin on 3/23/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<User> myList;
    private IBaseCallback iBaseCallback;

    public CustomAdapter(List<User> myList, IBaseCallback iBaseCallback) {
        this.myList = myList;
        this.iBaseCallback = iBaseCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflater_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = myList.get(position);
        holder.tvTxt.setText(user.getName());
        holder.itemView.setTag(user);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public void refresh(List<User> mList) {
        this.myList = mList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTxt;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            tvTxt = itemView.findViewById(R.id.tvTxt);
            tvTxt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    iBaseCallback.onClick((User) itemView.getTag());
                }
            });
        }
    }
}
