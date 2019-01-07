package com.example.will.shoppinglist;

import java.util.ArrayList;

public class CLAmodel
{
    private String add_button_text;
    private ArrayList<String> ArrayList;

    public CLAmodel()
    {

    }

    public void setAddbuttonText(String text)
    {
        add_button_text = text;
    }
    public void setList(ArrayList<String> Array)
    {
        ArrayList = Array;
    }

    public String getAddbuttonText()
    {
        return add_button_text;
    }

    public ArrayList<String> getList()
    {
        return ArrayList;
    }

}
