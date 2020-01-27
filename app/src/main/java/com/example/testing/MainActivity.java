package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etFirst,etSecond;
    private Button btnSum,btnSub,btnDiv;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst=findViewById(R.id.etFirst);
        etSecond=findViewById(R.id.etSecond);
        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnDiv=findViewById(R.id.btnDiv);
        tvOutput=findViewById(R.id.tvOutput);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }

    private void Add(){
        float first =Float.parseFloat(etFirst.getText().toString());
        float second =Float.parseFloat(etSecond.getText().toString());
        Arithematic arithematic=new Arithematic();

        float result=arithematic.add(first,second);
        Intent intent=new Intent(MainActivity.this,OutputActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
