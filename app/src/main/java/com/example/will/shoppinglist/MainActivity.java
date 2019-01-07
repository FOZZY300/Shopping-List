package com.example.will.shoppinglist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createList;
        createList = findViewById(R.id.createList);
        createList.setOnClickListener(new View.OnClickListener()                                    //OnClick listener for the  Next button
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = CreateListActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });

        Button viewLists;
        viewLists = findViewById(R.id.viewLists);
        viewLists.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
