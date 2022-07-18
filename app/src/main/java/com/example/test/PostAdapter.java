package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.modelclass.DATum;
import com.example.test.modelclass.Example;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    Context context;
    Example postList;

    PostAdapter(Context context, Example postList){
        this.context = context;
        this.postList = postList;
    }


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        DATum data = postList.getD().data.get(0).get(position);
        holder.name.setText("Student Name : " + data.getStudentName());
        holder.address.setText("Address : " + data.getAddress());
        holder.number.setText("Parent Number : " + data.getParentMob());

    }

    @Override
    public int getItemCount() {
        return postList.getD().data.get(0).size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView name , address , number;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            number = itemView.findViewById(R.id.number);
        }
    }
}
