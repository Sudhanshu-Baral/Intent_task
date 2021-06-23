package com.example.intent_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name,branch,year,regdNo;
    Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        name=findViewById (R.id.name);
        branch=findViewById (R.id.branch);
        year=findViewById (R.id.year);
        regdNo=findViewById (R.id.regd);
        show=findViewById (R.id.button);
        show.setOnClickListener (this);

    }


    @Override
    public void onClick(View v) {
        checkData();

    }
    private void checkData() {
        int k = 0;
        if (check(name)) {
            name.setError("Enter a name");
            k++;
        }
        if (check(branch)) {
            branch.setError("Enter a branch");
            k++;
        }
        if (check(regdNo)) {
            regdNo.setError("Enter correct regd no");
            k++;
        }
        if (check(year)) {
            year.setError("Enter a year");
            k++;
        } else if (k == 0) sendData();
    }

    private void sendData() {

        Intent intent=new Intent (MainActivity.this,MainActivity2.class);
                String sName=name.getText ().toString ();
                String sBranch=branch.getText ().toString ();
                String sYear=year.getText ().toString ();
                String sRegd=regdNo.getText ().toString ();
                intent.putExtra ("name",sName);
                intent.putExtra ("branch",sBranch);
                intent.putExtra ("year",sYear);
                intent.putExtra ("regdNo",sRegd);

                startActivity (intent);

    }

    private boolean check(EditText editText) {
        return TextUtils.isEmpty(editText.getText().toString());
    }

}