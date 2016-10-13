package com.ex.rohit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    String[] project_names,member_names;

    public RecyclerAdapter(String[] project_names,String[] member_names)
    {
        this.member_names=member_names;
        this.project_names=project_names;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder= new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tx_members.setText(member_names[position]);
        holder.tx_projects.setText(project_names[position]);
    }

    @Override
    public int getItemCount() {
        return member_names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView tx_projects,tx_members;
        public RecyclerViewHolder(View view)
        {
            super(view);
            tx_projects = (TextView)view.findViewById(R.id.tx_project_names);
            tx_members = (TextView)view.findViewById(R.id.tx_member_names);
        }
    }
}
