package com.example.yzxlz.familydoctor.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yzxlz.familydoctor.Function.Sign_in_doctor;
import com.example.yzxlz.familydoctor.Function.Sign_in_patient;
import com.example.yzxlz.familydoctor.R;

public class MyDoctorFragment extends Fragment {
    private ImageView patient_sign_in;
    private ImageView doctor_sign_in;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.my_doctor,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        patient_sign_in=getActivity().findViewById(R.id.patient);
        patient_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),Sign_in_patient.class);
                getActivity().startActivity(intent);

            }
        });

        doctor_sign_in=getActivity().findViewById(R.id.doctor);
        doctor_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),Sign_in_doctor.class);
                getActivity().startActivity(intent);

            }
        });

    }
}
