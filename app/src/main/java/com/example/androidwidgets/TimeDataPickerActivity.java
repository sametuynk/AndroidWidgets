package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.example.androidwidgets.databinding.ActivityTimeDataPickerBinding;

import java.util.Calendar;

public class TimeDataPickerActivity extends AppCompatActivity {

    private ActivityTimeDataPickerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTimeDataPickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.editTextSaat.setOnClickListener(v -> {

            Calendar calendar = Calendar.getInstance();
            int saat = calendar.get(Calendar.HOUR_OF_DAY);
            int dakika = calendar.get(Calendar.MINUTE);
            TimePickerDialog timePickerDialog;
            timePickerDialog=new TimePickerDialog(TimeDataPickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    binding.editTextSaat.setText(hourOfDay+" :"+minute);
                }
            },saat,dakika,true);
            timePickerDialog.setTitle("Saat seçiniz");
            timePickerDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePickerDialog);
            timePickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",timePickerDialog);
            timePickerDialog.show();

        });
        binding.editTextTarih.setOnClickListener(v -> {

            Calendar calendar=Calendar.getInstance();
            int yil=calendar.get(Calendar.YEAR);
            int ay=calendar.get(Calendar.MONTH);
            int gun=calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePicker;

            datePicker=new DatePickerDialog(TimeDataPickerActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    binding.editTextTarih.setText(dayOfMonth+"/"+month+"/"+year);
                }
            },yil,ay,gun);
            datePicker.setTitle("Tarih seçiniz");
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker);
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",datePicker);
            datePicker.show();
        });

    }
}