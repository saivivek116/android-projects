package com.example.saivivek.training;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToggleButton(View view) {

        boolean on=((ToggleButton)view).isChecked();
        if(on)
        {
            //statements
        }else
        {
            //statements
        }
    }

    public void onClickSwitch(View view) {
        boolean on=((Switch)view).isChecked();
        if(on)
        {
            //statements
        }else
        {
            //statements
        }
    }

    public void onClickCheckbox(View view) {
        boolean ch = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.milk:
                if (ch) {
                    //
                } else {
                    //
                }
                break;
            case R.id.sugar:
                if (ch) {
                    //
                } else {//
                }
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioGroup rg=findViewById(R.id.rdgroup);
        int id=rg.getCheckedRadioButtonId();
        switch(id)
        {
            case R.id.chess://
                break;
            case R.id.carrams://
                break;
            default: //
                    break;
        }
    }

//    public void onSpinnerItemSelected(View view) {
//        Spinner spinner=findViewById(R.id.sp);
//        String desert=String.valueOf(spinner.getSelectedItem());
//    }
}
