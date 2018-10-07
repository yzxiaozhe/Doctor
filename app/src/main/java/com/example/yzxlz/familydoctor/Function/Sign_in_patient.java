package com.example.yzxlz.familydoctor.Function;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yzxlz.familydoctor.R;

public class Sign_in_patient extends Activity{

    /*@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.patient_sign,container,false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }*/

    private Button patient_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_sign);
        patient_button=findViewById(R.id.patient_button);
        patient_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setResult(10);
                finish();
            }
        });
    }
}
