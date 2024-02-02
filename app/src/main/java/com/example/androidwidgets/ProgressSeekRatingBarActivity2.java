package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import com.example.androidwidgets.databinding.ActivityProgressSeekRatingBar2Binding;

public class ProgressSeekRatingBarActivity2 extends AppCompatActivity {

    private ActivityProgressSeekRatingBar2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityProgressSeekRatingBar2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonbasla.setOnClickListener(v -> {
            binding.progressBar.setVisibility(View.VISIBLE);
        });

        binding.buttonDur.setOnClickListener(v -> {
            binding.progressBar.setVisibility(View.INVISIBLE);
        });

        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                binding.textViewSonuc.setText("Sonuç : "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        binding.buttonProgress.setOnClickListener(v -> {
            float gelenOylama=binding.ratingBar.getRating();
            int gelenIlerleme=binding.seekBar.getProgress();

            Log.e("Oylama Sonucu",String.valueOf(gelenOylama));
            Log.e("İlerleme Sonucu",String.valueOf(gelenIlerleme));
        });

    }
}