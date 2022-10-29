package com.keegan.android.fragmentlightv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        if(fragmentManager.findFragmentById(R.id.leftFragment) == null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            LeftFragment leftFragment = new LeftFragment();
            transaction.add(R.id.leftFragment, leftFragment);
            transaction.commit();
        }

        if(fragmentManager.findFragmentById(R.id.rightFragment) == null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            RightFragment rightFragment = new RightFragment();
            transaction.add(R.id.rightFragment, rightFragment);
            transaction.commit();
        }
    }
}