package com.a7top.yutioio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.android.IOIOActivity;

public class MainActivity extends IOIOActivity implements View.OnClickListener {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inintsll viewll

        initialView();

        //Button Controler

        button.setOnClickListener(MainActivity.this);



    } //Main Medtrod

    class Looper extends BaseIOIOLooper {



    }  // Looper Class



    private void initialView() {

        button = (Button) findViewById(R.id.btnCheck);


    }


    @Override
    public void onClick(View view) {

    } // onclick




}  //Main Class
