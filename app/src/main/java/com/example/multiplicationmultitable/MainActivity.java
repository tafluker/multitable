package com.example.multiplicationmultitable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int chartMultiple = 0;
    private Button mMulti1;
    private Button mMulti2;
    private Button mMulti3;
    private Button mMulti4;
    private Button mMulti5;
    private Button mMulti6;
    private Button mMulti7;
    private Button mMulti8;
    private Button mMulti9;
    private Button mMulti10;
    private Button mMulti11;
    private Button mMulti12;
    private Button mChartInt;
    private int tempInt = 0;
    private String tempString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMulti1 = (Button) findViewById(R.id.multi1);
        mMulti2 = (Button) findViewById(R.id.multi2);
        mMulti3 = (Button) findViewById(R.id.multi3);
        mMulti4 = (Button) findViewById(R.id.multi4);
        mMulti5 = (Button) findViewById(R.id.multi5);
        mMulti6 = (Button) findViewById(R.id.multi6);
        mMulti7 = (Button) findViewById(R.id.multi7);
        mMulti8 = (Button) findViewById(R.id.multi8);
        mMulti9 = (Button) findViewById(R.id.multi9);
        mMulti10 = (Button) findViewById(R.id.multi10);
        mMulti11 = (Button) findViewById(R.id.multi11);
        mMulti12 = (Button) findViewById(R.id.multi12);
        mChartInt = (Button) findViewById(R.id.chart_int);

        int tem1 = 1;
        int multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show1 = getString(R.string.multi_1, tem1, multiplyByChartInt);
        mMulti1.setText(show1);

        int tem2 = 2;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show2 = getString(R.string.multi_2, tem2, multiplyByChartInt);
        mMulti2.setText(show2);

        int tem3 = 3;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show3 = getString(R.string.multi_3, tem3, multiplyByChartInt);
        mMulti3.setText(show3);

        int tem4 = 4;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show4 = getString(R.string.multi_4, tem4, multiplyByChartInt);
        mMulti4.setText(show4);

        int tem5 = 5;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show5 = getString(R.string.multi_5, tem5, multiplyByChartInt);
        mMulti5.setText(show5);

        int tem6 = 6;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show6 = getString(R.string.multi_6, tem6, multiplyByChartInt);
        mMulti6.setText(show6);

        int tem7 = 7;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show7 = getString(R.string.multi_7, tem7, multiplyByChartInt);
        mMulti7.setText(show7);

        int tem8 = 8;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show8 = getString(R.string.multi_8, tem8, multiplyByChartInt);
        mMulti8.setText(show8);

        int tem9 = 9;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show9 = getString(R.string.multi_9, tem9, multiplyByChartInt);
        mMulti9.setText(show9);

        int tem10 = 10;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show10 = getString(R.string.multi_10, tem10, multiplyByChartInt);
        mMulti10.setText(show10);

        int tem11 = 11;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show11 = getString(R.string.multi_11, tem11, multiplyByChartInt);
        mMulti11.setText(show11);

        int tem12 = 12;
        multiplyByChartInt = Integer.parseInt(mChartInt.getText().toString());
        String show12 = getString(R.string.multi_12, tem12, multiplyByChartInt);
        mMulti12.setText(show12);
    }




    public void addChartInt(View view) {
        chartMultiple++;
        if (chartMultiple == 13){ chartMultiple = 12; }
        mChartInt.setText(String.valueOf(chartMultiple));

        for (int i = 1; i < 13; i++){

            if (i == 1){
                String show = getString(R.string.multi_1, i, chartMultiple);
                mMulti1.setText(show);
            }
            if (i == 2){
                String show = getString(R.string.multi_2, i, chartMultiple);
                mMulti2.setText(show);
            }
            if (i == 3){
                String show = getString(R.string.multi_3, i, chartMultiple);
                mMulti3.setText(show);
            }
            if (i == 4){
                String show = getString(R.string.multi_4, i, chartMultiple);
                mMulti4.setText(show);
            }
            if (i == 5){
                String show = getString(R.string.multi_5, i, chartMultiple);
                mMulti5.setText(show);
            }
            if (i == 6){
                String show = getString(R.string.multi_6, i, chartMultiple);
                mMulti6.setText(show);
            }
            if (i == 7){
                String show = getString(R.string.multi_7, i, chartMultiple);
                mMulti7.setText(show);
            }
            if (i == 8){
                String show = getString(R.string.multi_8, i, chartMultiple);
                mMulti8.setText(show);
            }
            if (i == 9){
                String show = getString(R.string.multi_9, i, chartMultiple);
                mMulti9.setText(show);
            }
            if (i == 10){
                String show = getString(R.string.multi_10, i, chartMultiple);
                mMulti10.setText(show);
            }
            if (i == 11){
                String show = getString(R.string.multi_11, i, chartMultiple);
                mMulti11.setText(show);
            }
            if (i == 12){
                String show = getString(R.string.multi_12, i, chartMultiple);
                mMulti12.setText(show);
            }
        }
    }


    public void subtractChartInt(View view) {
        chartMultiple--;
        if (chartMultiple == - 1){ chartMultiple = 0; }
        mChartInt.setText(String.valueOf(chartMultiple));

        for (int i = 1; i < 13; i++){

            if (i == 1){
                String show = getString(R.string.multi_1, i, chartMultiple);
                mMulti1.setText(show);
            }
            if (i == 2){
                String show = getString(R.string.multi_2, i, chartMultiple);
                mMulti2.setText(show);
            }
            if (i == 3){
                String show = getString(R.string.multi_3, i, chartMultiple);
                mMulti3.setText(show);
            }
            if (i == 4){
                String show = getString(R.string.multi_4, i, chartMultiple);
                mMulti4.setText(show);
            }
            if (i == 5){
                String show = getString(R.string.multi_5, i, chartMultiple);
                mMulti5.setText(show);
            }
            if (i == 6){
                String show = getString(R.string.multi_6, i, chartMultiple);
                mMulti6.setText(show);
            }
            if (i == 7){
                String show = getString(R.string.multi_7, i, chartMultiple);
                mMulti7.setText(show);
            }
            if (i == 8){
                String show = getString(R.string.multi_8, i, chartMultiple);
                mMulti8.setText(show);
            }
            if (i == 9){
                String show = getString(R.string.multi_9, i, chartMultiple);
                mMulti9.setText(show);
            }
            if (i == 10){
                String show = getString(R.string.multi_10, i, chartMultiple);
                mMulti10.setText(show);
            }
            if (i == 11){
                String show = getString(R.string.multi_11, i, chartMultiple);
                mMulti11.setText(show);
            }
            if (i == 12){
                String show = getString(R.string.multi_12, i, chartMultiple);
                mMulti12.setText(show);
            }
        }
    }

    public void showMulti2(View view) {

        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 2;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti3(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 3;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti5(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 5;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti7(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 7;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti1(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString());
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti12(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 12;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti11(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 11;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti10(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 10;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti8(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 8;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti4(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 4;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti6(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 6;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMulti9(View view) {
        tempInt = Integer.parseInt(mChartInt.getText().toString()) * 9;
        tempString = String.valueOf(tempInt);
        Toast toast = Toast.makeText(this, tempString, Toast.LENGTH_SHORT);
        toast.show();
    }
}
