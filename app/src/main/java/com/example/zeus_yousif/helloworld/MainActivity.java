package com.example.zeus_yousif.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View V){
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        TextView sign = (TextView)findViewById(R.id.Sign);
        TextView fail = (TextView)findViewById(R.id.textView3);

        Log.w("myApp", "Calculate Button Clicked!!");

        if (e1.getText().toString().equals("") || e2.getText().toString().equals("")){
        fail.setText("Please Input Data");
            Log.w("myApp", "No Data");
        }
        else{

        fail.setText("");
        if (sign.getText().equals("+")){
            int x = Integer.parseInt(e1.getText().toString())+Integer.parseInt(e2.getText().toString());
            t1.setText(Integer.toString(x));
            Log.w("myApp", "Plus Sign Active");
        }
        else if (sign.getText().equals("-")){
            int x = Integer.parseInt(e1.getText().toString()) - Integer.parseInt(e2.getText().toString());
            t1.setText(Integer.toString(x));
            Log.w("myApp", "Minus Sign Active");

        }
        else if (sign.getText().equals("*")){
            int x = Integer.parseInt(e1.getText().toString()) - Integer.parseInt(e2.getText().toString());
            t1.setText(Integer.toString(x));
            Log.w("myApp", "Multiply Sign Active");
        }

        }

    }
    public void add(View V){
        TextView sign = (TextView)findViewById(R.id.Sign);
        Button plus = (Button)findViewById(R.id.plus);
        sign.setText(plus.getText());
    }

    public void sub(View V){
        TextView sign = (TextView)findViewById(R.id.Sign);
        Button minus = (Button)findViewById(R.id.minus);
        sign.setText(minus.getText());
    }
    public void clear(View V){
        TextView ans = (TextView)findViewById(R.id.textView2);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);

        ans.setText("Answer");
        e1.getText().clear();
        e2.getText().clear();
    }
}
