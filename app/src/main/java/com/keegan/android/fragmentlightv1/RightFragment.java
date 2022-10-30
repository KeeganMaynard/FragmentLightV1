package com.keegan.android.fragmentlightv1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    public void setRedLight(){
        View fragmentView = getView();
        TextView trafficLight = (TextView) fragmentView.findViewById(R.id.traffic_light);
        trafficLight.setText(R.string.red_light);
        trafficLight.setBackgroundColor(Color.RED);
    }

    public void setGreenLight(){
        View fragmentView = getView();
        TextView trafficLight = (TextView) fragmentView.findViewById(R.id.traffic_light);
        trafficLight.setText(R.string.green_light);
        trafficLight.setBackgroundColor(Color.GREEN);
    }

    public void setYellowLight(){
        View fragmentView = getView();
        TextView trafficLight = (TextView) fragmentView.findViewById(R.id.traffic_light);
        trafficLight.setText(R.string.yellow_light);
        trafficLight.setBackgroundColor(Color.YELLOW);
    }
}
