package com.example.ryansetiagi.smarthomepremium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
/**
 * Created by Ryan Setiagi on 17/05/2017.
 */

public class LampActivity extends AppCompatActivity{

    Switch mSwitch1, mSwitch2, mSwitch3;


    DatabaseReference mBasisData = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mRefLampu1 = mBasisData.child("lampu_1");
    DatabaseReference mRefLampu2 = mBasisData.child("lampu_2");
    DatabaseReference mRefLampu3 = mBasisData.child("lampu_3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp);

        mSwitch1 = (Switch) findViewById(R.id.switch1);
        mSwitch2 = (Switch) findViewById(R.id.switch2);
        mSwitch3 = (Switch) findViewById(R.id.switch3);


    }

    @Override
    protected void onStart(){
        super.onStart();

        mSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    mRefLampu1.setValue("ON");
                }
                else {
                    mRefLampu1.setValue("OFF");
                }

            }

        });

        mSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    mRefLampu2.setValue("ON");
                }
                else {
                    mRefLampu2.setValue("OFF");
                }
            }
        });

        mSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    mRefLampu3.setValue("ON");
                }
                else {
                    mRefLampu3.setValue("OFF");
                }
            }
        });


    }

}
