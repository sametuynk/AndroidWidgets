package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityImageViewBinding;

public class ImageViewActivity extends AppCompatActivity {

    private ActivityImageViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityImageViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonR1.setOnClickListener(v -> {
            binding.imageView.setImageResource(R.drawable.resim1);
        });

        binding.buttonR2.setOnClickListener(v -> {
            binding.imageView.setImageResource(getResources().getIdentifier(
                    "resim2"
                    ,"drawable"
                    ,getPackageName()));
        });
    }
}