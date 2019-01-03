package com.example.will.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateListActivity extends AppCompatActivity
{

    public static Intent newIntent(Context packageContext, int todoIndex)                           // Any calling activity would call this static method and pass the necessary
    {                                                                                               // key, value data pair in an intent object.
        Intent intent = new Intent(packageContext, CreateListActivity.class);
        intent.putExtra("test", todoIndex);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        Button newListItem;
        newListItem = findViewById(R.id.newListItem);
        newListItem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
