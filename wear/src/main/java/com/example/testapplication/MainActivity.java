package com.example.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    Button button_mypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);


        button_mypage = (Button) findViewById(R.id.button_mypage);
        button_mypage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToMypage(view);
//                Toast.makeText(MainActivity.this, "Goedemiddag", Toast.LENGTH_SHORT).show();
            }
        });
        // Enables Always-on
        setAmbientEnabled();
    }

    private void goToMypage(View view) {
        Intent intent = new Intent(this, MypageActivity.class);
        startActivity(intent);
    }
}
