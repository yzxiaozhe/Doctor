package com.example.yzxlz.familydoctor;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yzxlz.familydoctor.Fragment.ChatFragment;
import com.example.yzxlz.familydoctor.Fragment.HomeFragment;
import com.example.yzxlz.familydoctor.Fragment.MyDoctorFragment;
import com.example.yzxlz.familydoctor.Fragment.DiagnoseFragment;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private HomeFragment Hfragment;
    private DiagnoseFragment Rfragment;
    private ChatFragment Cfragment;
    private MyDoctorFragment Mfragment;
    private Fragment[] fragments;
    private int lastfragment;       //记录上一个fragment
    private TextView show_sign_name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(changeFragment);
        initFragment();

        show_sign_name=(TextView)findViewById(R.id.show_sign_name);

    }

    private void initFragment(){
        Hfragment=new HomeFragment();
        Rfragment=new DiagnoseFragment();
        Cfragment=new ChatFragment();
        Mfragment=new MyDoctorFragment();
        fragments=new Fragment[]{Hfragment,Rfragment,Cfragment,Mfragment};
        lastfragment=0;
        getSupportFragmentManager().beginTransaction().replace(R.id.mainview,Hfragment).show(Hfragment).commit();

    }

    //判断选择的菜单
    private BottomNavigationView.OnNavigationItemSelectedListener changeFragment= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {

            switch (item.getItemId())
            {
                case R.id.home_page:
                {
                    if(lastfragment!=0)
                    {
                        switchFragment(lastfragment,0);
                        lastfragment=0;

                    }

                    return true;
                }
                case R.id.recommend_page:
                {
                    if(lastfragment!=1)
                    {
                        switchFragment(lastfragment,1);
                        lastfragment=1;

                    }

                    return true;
                }
                case R.id.chat_page:
                {
                    if(lastfragment!=2)
                    {
                        switchFragment(lastfragment,2);
                        lastfragment=2;

                    }

                    return true;
                }
                case R.id.my_page:
                {
                    if (lastfragment!=3){
                        switchFragment(lastfragment,3);
                        lastfragment=3;
                    }

                    return true;
                }


            }


            return false;
        }
    };
    //切换Fragment
    private void switchFragment(int lastfragment,int index)
    {
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.hide(fragments[lastfragment]);//隐藏上个Fragment
        if(fragments[index].isAdded()==false)
        {
            transaction.add(R.id.mainview,fragments[index]);


        }
        transaction.show(fragments[index]).commitAllowingStateLoss();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1&& resultCode==10){
            RelativeLayout sign_in_layout=(RelativeLayout)findViewById(R.id.sign_in_layout);
            sign_in_layout.setVisibility(View.GONE);
            findViewById(R.id.finish_data_layout).setVisibility(View.GONE);
            findViewById(R.id.exit_sign).setVisibility(View.VISIBLE);
            /*//回传数据到此处
            Bundle bundle=data.getExtras();
            show_sign_name.setText(bundle.getString("doctor_name"));
*/
        }
        if (requestCode==2&& resultCode==10){
            RelativeLayout sign_in_layout=(RelativeLayout)findViewById(R.id.sign_in_layout);
            sign_in_layout.setVisibility(View.GONE);
            findViewById(R.id.exit_sign).setVisibility(View.VISIBLE);



        }

    }
}
