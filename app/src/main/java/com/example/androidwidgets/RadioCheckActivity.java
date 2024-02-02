package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityRadioCheckBinding;

public class RadioCheckActivity extends AppCompatActivity {

    private ActivityRadioCheckBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRadioCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.radioButtonBJK.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(RadioCheckActivity.this, "Tebrikler BJK takımını seçtiniz :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.radioButtonGS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(RadioCheckActivity.this, "Tebrikler GS takımını seçtiniz :)", Toast.LENGTH_SHORT).show();
            }
        });
        binding.checkBoxJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(RadioCheckActivity.this, "Tebrikler JAVA Dilini Seçtiniz", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.button.setOnClickListener(v -> {
            boolean javaDurum=binding.checkBoxJava.isChecked();
            boolean kotlinDurum=binding.checkBoxKotlin.isChecked();
            boolean radioBjkDurum=binding.radioButtonBJK.isChecked();
            boolean radioGsDurum=binding.radioButtonGS.isChecked();

            Log.e("Java Durum",String.valueOf(javaDurum));
            Log.e("Kotlin Durum",String.valueOf(kotlinDurum));
            Log.e("BJK Durum",String.valueOf(radioBjkDurum));
            Log.e("GS Durum",String.valueOf(radioGsDurum));
        });

    }
}