package com.example.android.mva;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewFlipper;

public class VisualAcuity extends Fragment implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button b1,b2,b3,b4;
    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View visualAcuityView =  inflater.inflate(R.layout.fragment_visual_acuity, container, false);

        viewFlipper=visualAcuityView.findViewById(R.id.ViewFlipper);
        b1= visualAcuityView.findViewById(R.id.button_right);
        b2= visualAcuityView.findViewById(R.id.button_left);
        b3= visualAcuityView.findViewById(R.id.button_top);
        b4= visualAcuityView.findViewById(R.id.button_bottom);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        return visualAcuityView;
    }
    @Override
    public void onClick(View v) {
        if (v == b1) {
            viewFlipper.showNext();
        } else if (v == b2) {
            viewFlipper.showNext();
        } else if (v == b3) {
            viewFlipper.showNext();
        } else if (v == b4) {
            viewFlipper.showNext();
        }


    }
}
