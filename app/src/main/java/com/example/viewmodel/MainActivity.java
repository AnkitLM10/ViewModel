package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.viewmodel.ViewModel.MainActivityViewModel;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int k = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        MainActivityViewModel mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        tv.setText(mainActivityViewModel.getNum());
        Random random = new Random();
        tv1.setText(random.nextInt(5000)+"");
        k = 10;

    }
}