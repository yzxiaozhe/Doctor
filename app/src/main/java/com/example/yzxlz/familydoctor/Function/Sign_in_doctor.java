package com.example.yzxlz.familydoctor.Function;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yzxlz.familydoctor.Fragment.MyDoctorFragment;
import com.example.yzxlz.familydoctor.MainActivity;
import com.example.yzxlz.familydoctor.R;

public class Sign_in_doctor extends Activity{
    private Button doctor_button;
    private EditText doctor_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_sign);
        doctor_button=findViewById(R.id.doctor_button);
        doctor_name=findViewById(R.id.adm_put_in);
        doctor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* Intent intent=new Intent();
                intent.putExtra("doctor_name",doctor_name.getText().toString());*/
                setResult(10);
                finish();
            }
        });

    }



}
