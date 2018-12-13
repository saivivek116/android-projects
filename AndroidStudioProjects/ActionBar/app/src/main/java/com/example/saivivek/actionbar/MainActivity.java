package com.example.saivivek.actionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button b;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.number);
       final int num=Integer.parseInt(e.getText().toString());
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Activity2.class);
                i.putExtra("number",num);
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.search:
                Toast.makeText(this, "search selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:    Toast.makeText(this, "settings selected", Toast.LENGTH_SHORT).show();
            break;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }


}
