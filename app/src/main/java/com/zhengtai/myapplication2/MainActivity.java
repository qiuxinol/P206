package com.zhengtai.myapplication2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity{

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        setListeners();
    }

    private void setListeners(){
        onClick onClick=new onClick();
        button1.setOnClickListener(onClick);
    }

    private class onClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.button1:
                    AnotherRightFragment arf=new AnotherRightFragment();
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.right_layout,arf);
                    ft.addToBackStack(null);
                    ft.commit();
                    break;
                default:
            }
        }
    }

}
