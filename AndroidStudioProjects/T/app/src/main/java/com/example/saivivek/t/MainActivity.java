package com.example.saivivek.t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void nextActivity(View view) {
      //  Intent intent=new Intent(this,Welcome.class);//if u want to pass to particular intent called explicit intent
        //Intent.putExtra(Welcome.EXTRA_MESSAGE,message);
        Intent intent=new Intent(Intent.ACTION_SEND);
        //Intent intent=new Intent(action);
        //action=Intent.ACTION_DIAL,Intent.ACTION_WEB_SEARCH
        intent.setType("text/plain");
        EditText et=(EditText)findViewById(R.id.te);
        String text=String.valueOf(et.getText());
        intent.putExtra(Intent.EXTRA_TEXT,text);
        Intent chooseintent=Intent.createChooser(intent,"send message");
        startActivity(chooseintent);
    }
}
