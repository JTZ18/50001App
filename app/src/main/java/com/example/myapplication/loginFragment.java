package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

//Create a Fragment class that returns the layout that you just created in the onCreateView() method.
// You can then create instances of this fragment in the parent activity whenever you need a new page to display to the user:
// This class is to create pages for the views, not fragment

public class loginFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_login, container, false);
    }

}
