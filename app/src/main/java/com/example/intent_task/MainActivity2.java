package com.example.intent_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,branch,year,regdNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        name=findViewById (R.id.name);
        branch=findViewById (R.id.branch);
        year=findViewById (R.id.year);
        regdNo=findViewById (R.id.regd);

        String sName=getIntent ().getStringExtra ("name");
        String sBranch=getIntent ().getStringExtra ("branch");
        String sYear=getIntent ().getStringExtra ("year");
        String sRegd=getIntent ().getStringExtra ("regdNo");

        name.setText (sName);
        branch.setText (sBranch);
        year.setText (sYear);
        regdNo.setText (sRegd);


    }
}