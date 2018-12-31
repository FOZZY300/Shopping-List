package com.example.will.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{
    private static final int IS_SUCCESS = 0;

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
                Intent intentCreateList = NewListActivity.newIntent(MainActivity.this);
                startActivityForResult(intentCreateList, IS_SUCCESS);

            }
        });

        Button viewLists;
        viewLists = findViewById(R.id.createList);
        viewLists.setOnClickListener(new View.OnClickListener()                                    //OnClick listener for the  Next button
        {
            @Override
            public void onClick(View v)
            {

            }
        });

    }
}
