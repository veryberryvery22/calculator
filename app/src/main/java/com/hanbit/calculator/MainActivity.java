package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etNum1,etNum3;
    Button btPlus,btMinus, btMulti, btDivide ,btEqual;
    TextView tvResult;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 =(EditText) findViewById(R.id.etNum1);
        etNum3 =(EditText) findViewById(R.id.etNum3);

        btPlus= (Button) findViewById(R.id.btPlus);
        btMinus= (Button) findViewById(R.id.btMinus);
        btMulti= (Button) findViewById(R.id.btMulti);
        btDivide= (Button) findViewById(R.id.btDivide);
        btEqual= (Button) findViewById(R.id.btEqual);
        tvResult= (TextView) findViewById(R.id.tvResult);

        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btEqual.setOnClickListener(this);


        }




    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum3.getText().toString());


        switch(v.getId()){
            case R.id.btPlus:
                result = num1 + num2;
                break;
            case R.id.btMinus:
                result=num1-num2;
                break;
            case R.id.btMulti:
                result=num1*num2;
                break;
            case R.id.btDivide:
                result=num1 / num2;
                break;

            case R.id.btEqual:
               tvResult.setText("RESULT :"+result);

                break;

        }
}

}
