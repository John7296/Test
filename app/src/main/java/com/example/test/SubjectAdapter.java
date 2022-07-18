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



public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.PostViewHolder> {

    Context context;
    Example postList;

    SubjectAdapter(Context context, Example postList){
        this.context = context;
        this.postList = postList;
    }


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.subjects,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        DATum data = postList.getD().data.get(0).get(position);
        holder.subject.setText("Subject : " + data.getSubjectName());
        holder.mark.setText("Maximum Mark : " + data.getMaxMark());

    }

    @Override
    public int getItemCount() {
        return postList.getD().data.get(0).size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView subject , mark;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            subject = itemView.findViewById(R.id.subject);
            mark = itemView.findViewById(R.id.mark);

        }
    }
}
