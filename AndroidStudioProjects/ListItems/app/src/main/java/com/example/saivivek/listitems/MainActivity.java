package com.example.saivivek.listitems;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config=getResources().getConfiguration();
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();


        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Lm l=new Lm();
            ft.replace(android.R.id.content,l);

        }else{
            Pm p=new Pm();
            ft.replace(android.R.id.content,p);

        }
        ft.commit();
    }



}
