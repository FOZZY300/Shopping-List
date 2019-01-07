package com.example.will.shoppinglist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class ListFragment extends Fragment
{
    private EditText itemInput;
    private Button newListItem, finishList;
    private ListView list;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        itemInput = view.findViewById(R.id.itemInput);
        newListItem = view.findViewById(R.id.newListItem);
        finishList = view.findViewById(R.id.finishList);
        list = view.findViewById(R.id.list);

        return view;

    }
}
