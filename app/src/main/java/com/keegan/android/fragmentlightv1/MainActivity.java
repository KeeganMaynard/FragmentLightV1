package com.keegan.android.fragmentlightv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        if(fragmentManager.findFragmentById(R.id.rightFragment) == null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            RightFragment rightFragment = new RightFragment();
            transaction.add(R.id.rightFragment, rightFragment);
            transaction.commit();
        }
    }

    public void updateLight(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        RightFragment rightFragment = (RightFragment) fragmentManager.findFragmentById(R.id.rightFragment);
        View rightFragmentView = rightFragment.getView();
        TextView lightButton = (TextView) rightFragmentView.findViewById(R.id.traffic_light);

        if(lightButton.getText().toString().equals("Red Light"))
        {
            rightFragment.setGreenLight();
        }
        else if(lightButton.getText().toString().equals("Green Light"))
        {
            rightFragment.setYellowLight();
        }
        else{       //yellow light
            rightFragment.setRedLight();
        }
    }
}