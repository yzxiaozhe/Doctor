package com.example.yzxlz.familydoctor.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yzxlz.familydoctor.Function.Sign_in_patient;
import com.example.yzxlz.familydoctor.Function.Test;
import com.example.yzxlz.familydoctor.R;

public class DiagnoseFragment extends Fragment {
    private TextView TestView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.diagnose,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TestView=getActivity().findViewById(R.id.test);
        TestView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),Test.class);
                getActivity().startActivityForResult(intent,3);
            }
        });


    }
}
