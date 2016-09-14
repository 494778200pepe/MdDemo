package com.zitech.mddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by pepe on 2016/9/14.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn0://
                startActivity(new Intent(this, AndroidUIAct.class));
                break;
            case R.id.main_btn1://
                startActivity(new Intent(this, MaterialMenuAct.class));
                break;
            case R.id.main_btn2://
                startActivity(new Intent(this, RippleEffectAct.class));
                break;
            case R.id.main_btn3://
                startActivity(new Intent(this, TickplusdrawableAct.class));
                break;

        }
    }
}
