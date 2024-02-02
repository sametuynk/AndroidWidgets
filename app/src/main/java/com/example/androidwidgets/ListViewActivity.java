package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {


    private ArrayList<String>ulkeler=new ArrayList<>();
    private ArrayAdapter<String>veriAdaptoru;
    private ActivityListViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ulkeler.add("TÜRKİYE");
        ulkeler.add("ABD");
        ulkeler.add("RUSYA");
        ulkeler.add("ALMANYA");
        ulkeler.add("İSPANYA");
        ulkeler.add("İNGİLTERE");
        ulkeler.add("HOLLANDA");

        veriAdaptoru=new ArrayAdapter<>(ListViewActivity.this
                ,android.R.layout.simple_list_item_1
                ,android.R.id.text1
                ,ulkeler);

        binding.listView.setAdapter(veriAdaptoru);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this
                        , "Seçtiğiniz Ülke : "+ulkeler.get(position)
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}