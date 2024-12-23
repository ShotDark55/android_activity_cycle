package com.okiyacode.activitycycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    ImageView btnInfo,btnClose;
    Context context;
    private void setup() {
        context = this;
        btnInfo = findViewById(R.id.btnInfoID);
        btnClose = findViewById(R.id.closeID);
    }

    private void display(String msg) {
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        setup();

        display("onCreate");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        btnInfo.setOnClickListener(View-> {

            Intent intent = new Intent(MainActivity.this, how_work.class);
            startActivity(intent);

        });


        btnClose.setOnClickListener(View-> {
            finish();
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        display("onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        display("onResume");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        display("onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        display("onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        display("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        display("onDestroy");
    }
}
