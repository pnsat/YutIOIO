package com.a7top.yutioio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.IOIOLooper;
import ioio.lib.util.android.IOIOActivity;

public class MainActivity extends IOIOActivity implements View.OnClickListener {

    private Button button;
    private String tag = "7apiv1";
    private boolean aBoolean = false;



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

        @Override
        protected void setup() throws ConnectionLostException, InterruptedException {
            //super.setup();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getApplicationContext(),"Connected IOIO OK",
                            Toast.LENGTH_LONG).show();
                    button.setText("Connecter OK");

                }
            });

        }  // setup

        @Override
        public void loop() throws ConnectionLostException, InterruptedException {
           // super.loop();

            try {
                Thread.sleep(100);


            } catch (Exception e) {
                Log.d(tag, "e loop ==>" + e.toString());


            }

        }


    }  // Looper Class

    protected IOIOLooper createIOIOLooper() {

        return new Looper();
    }



    private void initialView() {

        button = (Button) findViewById(R.id.btnCheck);


    }


    @Override
    public void onClick(View view) {

    } // onclick




}  //Main Class
