package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
        EditText num;
        TextView tipAmount;
        TextView totalAmount;
        Button additionButton,subButton;
        TextView percent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            num=(EditText)findViewById(R.id.billAmount);
             additionButton=(Button) findViewById(R.id.addButton);
             subButton=(Button) findViewById(R.id.minusbutton2);

             tipAmount=(TextView)   findViewById(R.id.tipAmount);
         totalAmount=(TextView) findViewById(R.id.totalAmount);
         percent=(TextView) findViewById(R.id.percentage);

    }

    public void addPercent(View view) {
        Log.i("info","PlusButtonPressed");
        String percentValue=percent.getText().toString();
        percentValue= percentValue.replace("%","");
        int percentInt=Integer.parseInt(percentValue.toString());
        int finalPercentage=percentInt+1;
        percent.setText(finalPercentage+"%");
        //get billamount as int
        String billString =num.getText().toString();
        int billInt=Integer.parseInt(billString);

        //calculate tip

        double finalTip=(finalPercentage/100.0)*billInt;
        tipAmount.setText("$"+finalTip);
        Log.i("info ","sum");
        totalAmount.setText("$"+(finalTip+finalPercentage));

    }

    public void subtract(View view) {

        Log.i("info","PlusButtonPressed");
        String percentValue=percent.getText().toString();

        percentValue= percentValue.replace("%","");
        int percentInt=Integer.parseInt(percentValue.toString());
        int finalPercentage=percentInt-1;
        percent.setText(finalPercentage+"%");
        //get billamount as int
        String billString =num.getText().toString();
        int billInt=Integer.parseInt(billString);

        //calculate tip

        double finalTip=(finalPercentage/100.0)*billInt;
        tipAmount.setText("$"+finalTip);
        Log.i("info ","sum");
        totalAmount.setText("$"+(finalTip+finalPercentage));

    }


}

