package com.example.will.shoppinglist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class ListFragment extends Fragment
{
    private EditText itemInput;
    private Button newListItem, finishList;
    private ListView list;

    private String item;
    private ArrayList<String> listArray = new ArrayList<String>();

    private CLAmodel model;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        model = new CLAmodel();
        model.setAddbuttonText("Add item");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        itemInput = (EditText) view.findViewById(R.id.itemInput);
        newListItem = (Button) view.findViewById(R.id.newListItem);
        finishList = (Button) view.findViewById(R.id.finishList);
        list = (ListView) view.findViewById(R.id.list);

        newListItem.setText(model.getAddbuttonText());

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), simple_list_item_1, listArray);
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
        });

        return view;
    }
}
