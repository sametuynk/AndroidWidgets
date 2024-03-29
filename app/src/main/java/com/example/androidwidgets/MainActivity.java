package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(v -> {
            Intent gecis=new Intent(MainActivity.this,ToogleSwitchActivity2.class);
            startActivity(gecis);
        });
        binding.button2.setOnClickListener(v -> {
            Intent gecis=new Intent(MainActivity.this,RadioCheckActivity.class);
            startActivity(gecis);
        });
        binding.button3.setOnClickListener(v -> {
            Intent gecis=new Intent(MainActivity.this,ProgressSeekRatingBarActivity2.class);
            startActivity(gecis);
        });
        binding.button4.setOnClickListener(v -> {
            Intent gecis=new Intent(getApplicationContext(), VebViewActivity.class);
            startActivity(gecis);
        });
        binding.button5.setOnClickListener(v -> {
            Intent gecis=new Intent(getApplicationContext(), ImageViewActivity.class);
            startActivity(gecis);
        });
        binding.button6.setOnClickListener(v -> {
            Intent gecis=new Intent(MainActivity.this,TimeDataPickerActivity.class);
            startActivity(gecis);
        });
        binding.button7.setOnClickListener(v -> {
            Intent gecis=new Intent(getApplicationContext(), ListViewActivity.class);
            startActivity(gecis);
        });
        binding.button9.setOnClickListener(v -> {
            Intent gecis=new Intent(getApplicationContext(), ToolbarOptionsActivity.class);
            startActivity(gecis);
        });



    }
}