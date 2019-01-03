package com.example.will.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

public class CreateListActivity extends AppCompatActivity
{
    private String[] list = new String[20];
    private String item;
    private String TAG = "isinputworking?";
    private int i = 0;

    public static Intent newIntent(Context packageContext, int todoIndex)                           // Any calling activity would call this static method and pass the necessary
    {                                                                                               // key, value data pair in an intent object.
        Intent intent = new Intent(packageContext, CreateListActivity.class);
        intent.putExtra("test", todoIndex);
        return intent;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("listIndex", i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        if (savedInstanceState != null)
        {
            i = savedInstanceState.getInt("listIndex");
        }

        final EditText itemInput = findViewById(R.id.itemInput);

        Button newListItem;
        newListItem = findViewById(R.id.newListItem);
        newListItem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               list[i] = itemInput.getText().toString();
               Log.v(TAG, "item = " + list[i]);
               updateItem(i);
               i++;
            }
        });
    }
    private void updateItem(int index)
    {
        final TextView listItem;
        listItem = (TextView) findViewById(R.id.listItem);
        listItem.setText(list[index]);                                         //Display the first task from mTodo array in the TodoTextView
    }
}
