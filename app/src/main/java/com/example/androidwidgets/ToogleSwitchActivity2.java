package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.androidwidgets.databinding.ActivityToogleSwitch2Binding;

public class ToogleSwitchActivity2 extends AppCompatActivity {

    private ActivityToogleSwitch2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityToogleSwitch2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.e("Switch","ON");
                }else{
                    Log.e("Switch","OFF");
                }
            }
        });
        binding.toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.e("Toogle Button","ON");
                }else{
                    Log.e("Toogle Button","OFF");
                }


            }
        });
        binding.buttonToogle.setOnClickListener(v -> {
            Boolean switchDurum=binding.switch1.isChecked();
            Boolean toggleButtonDurum=binding.toggleButton.isChecked();

            Log.e("Switch Durum ",String.valueOf(switchDurum));
            Log.e("Toggle Durum ",String.valueOf(toggleButtonDurum));
        });

    }
}