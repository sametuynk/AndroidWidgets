package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityVebViewBinding;

public class VebViewActivity extends AppCompatActivity {

    private ActivityVebViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //javascript özelliğini aktif ettik
        binding.webView.getSettings().setJavaScriptEnabled(true);

        binding.webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");
    }
}