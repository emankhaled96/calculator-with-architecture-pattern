package com.example.calculator_with_architecture_patterns.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator_with_architecture_patterns.R;
import com.example.calculator_with_architecture_patterns.pojo.DataBase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , NumberDivView{

    Button plusBtn , divideBtn , mulBtn ;
    TextView sumRes , divisonRes , mulRes;
    DivisionPresenter presenter;
    MulViewModel mulViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plusBtn = findViewById(R.id.plus_button);
        divideBtn = findViewById(R.id.div_button);
        mulBtn = findViewById(R.id.mul_button);


        sumRes = findViewById(R.id.plus_result_textView);
        divisonRes = findViewById(R.id.div_result_textView);
        mulRes = findViewById(R.id.mul_result_textView);

        plusBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        mulBtn.setOnClickListener(this);
        // MVP
        presenter = new DivisionPresenter(this);
        //MVVM
        mulViewModel = new ViewModelProvider(this).get(MulViewModel.class);
        mulViewModel.mulMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mulRes.setText(s);
            }
        });

    }


    public int getSumOfTheNumbers(){

        return new DataBase().getNumbers().getFirstNum() + new DataBase().getNumbers().getSecondNum();
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.plus_button){

            sumRes.setText("Sum = " + getSumOfTheNumbers());

        }
        else if(view.getId() == R.id.div_button){

            presenter.getDivsionResult();

        }else if(view.getId() == R.id.mul_button){

          mulViewModel.getResult();


        }

    }

    @Override
    public void onGetDivisionResult(int divResult) {
        divisonRes.setText("DivRes = " + divResult);
    }
}