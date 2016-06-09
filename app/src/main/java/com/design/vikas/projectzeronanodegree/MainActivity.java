package com.design.vikas.projectzeronanodegree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener onClickListener ;
    AppCompatButton compatButton1,compatButton2,compatButton3,compatButton4,compatButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setListener();
        registerListener();
    }


    private void setListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setting the listeners on button
                int id = view.getId();
                switch (id){

                    case R.id.btMovie1:
                        Toast.makeText(MainActivity.this,R.string.toast_msg1,Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btMovie2:
                        Toast.makeText(MainActivity.this,R.string.toast_msg2,Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btMovie3:
                        Toast.makeText(MainActivity.this,R.string.toast_msg3,Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btMovie4:
                        Toast.makeText(MainActivity.this,R.string.toast_msg4,Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btMovie5:
                        Toast.makeText(MainActivity.this,R.string.toast_msg5,Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
    }

    private void registerListener() {
        //register with the listener
        compatButton1.setOnClickListener(onClickListener);
        compatButton2.setOnClickListener(onClickListener);
        compatButton3.setOnClickListener(onClickListener);
        compatButton4.setOnClickListener(onClickListener);
        compatButton5.setOnClickListener(onClickListener);
    }

    private void bindView() {
        //setting the views
        compatButton1 = (AppCompatButton)findViewById(R.id.btMovie1);
        compatButton2 = (AppCompatButton)findViewById(R.id.btMovie2);
        compatButton3 = (AppCompatButton)findViewById(R.id.btMovie3);
        compatButton4 = (AppCompatButton)findViewById(R.id.btMovie4);
        compatButton5 = (AppCompatButton)findViewById(R.id.btMovie5);

    }
}
