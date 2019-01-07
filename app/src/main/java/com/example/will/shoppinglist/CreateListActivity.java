package com.example.will.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CreateListActivity extends AppCompatActivity
{
    //private String item;
    //private ArrayList<String> listArray = new ArrayList<String>();

    public static Intent newIntent(Context packageContext)
    {
        Intent intent = new Intent(packageContext, CreateListActivity.class);
        return intent;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        //savedInstanceState.putStringArrayList("saved list", listArray);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null)
        {
            ListFragment listFragment = new ListFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, listFragment)
                    .commit();
        }
/*
        if (savedInstanceState != null)
        {
            listArray = savedInstanceState.getStringArrayList("saved list");
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (CreateListActivity.this, android.R.layout.simple_list_item_1, listArray);
        list.setAdapter(adapter);

        newListItem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                item = itemInput.getText().toString();
                listArray.add(item);
                list.setAdapter(adapter);
                itemInput.setText("");
            }
        });

        finishList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });*/
    }
}
