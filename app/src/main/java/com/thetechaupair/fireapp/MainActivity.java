package com.thetechaupair.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);

        mRef = new Firebase("https://fireapp-76845.firebaseio.com/");

        mSendData = (Button) findViewById(R.id.addString);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase mRefChild = mRef.child("Name");

                mRefChild.setValue("Rheed");
            }
        });

    }
}
