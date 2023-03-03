package com.example.quest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewResult;
    EditText editTextAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult=findViewById(R.id.textViewResult);
        editTextAnswer=findViewById(R.id.editTextAnswer);
    }

    public void onClickSubmit(View view){
        int answer=Integer.parseInt(editTextAnswer.getText().toString());
        if(answer==25){
                textViewResult.setText("true");
            }
        else {
            textViewResult.setText("False");
        }
    }
}