package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button frag1, frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = findViewById(R.id.btnFrag1_main);
        frag2 = findViewById(R.id.btnFrag2_main);

    }
    
}
