package com.example.saivivek.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        int num=Integer.parseInt(getIntent().getStringExtra("number"));
        TextView t;
        t=findViewById(R.id.numback);
        t.setText(num);
        Button b=findViewById(R.id.submit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
