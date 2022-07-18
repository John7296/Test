package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.test.JSONPlaceholder;
import com.example.test.modelclass.Example;
import com.example.test.modelclass.StudentModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,recyclerViewSubject;
    JSONPlaceholder jsonPlaceholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewSubject = findViewById(R.id.recyclerViewSubject);
        recyclerViewSubject.setHasFixedSize(true);
        recyclerViewSubject.setLayoutManager(new LinearLayoutManager(this));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://apps.mnets.in:85/MCTest/Android/CommanAjaxRequest.aspx/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceholder = retrofit.create(JSONPlaceholder.class);

        createPost();
        createPostSubj();

    }

    private void  createPostSubj(){
        StudentModel studentModel = new StudentModel("Subject");

        Call<Example> call = jsonPlaceholder.createpostSubjects(studentModel);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example postList2 = new Example();
                postList2 = (response.body());
                SubjectAdapter subjectAdapter = new SubjectAdapter(MainActivity.this,postList2);
                recyclerViewSubject.setAdapter(subjectAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }

    private void  createPost(){
        StudentModel studentModel = new StudentModel("Student");

        Call<Example> call = jsonPlaceholder.createpost(studentModel);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example postList = new Example();
                postList = (response.body());
                PostAdapter postAdapter = new PostAdapter(MainActivity.this,postList);
                recyclerView.setAdapter(postAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }


}

