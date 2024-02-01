package com.example.androidwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityToolbarOptionsBinding;

public class ToolbarOptionsActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private ActivityToolbarOptionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityToolbarOptionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbar.setTitle("Toolbar Menu");
        setSupportActionBar(binding.toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);

        MenuItem item=menu.findItem(R.id.action_ara);
        SearchView searchView= (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.action_bilgi) {
            Toast.makeText(this, "Bilgi Tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.action_ayarlar) {
            Toast.makeText(this, "Ayarlar Tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.actipn_cikis) {
            Toast.makeText(this, "Çıkış Tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.action_ekle) {
            Toast.makeText(this, "Ekle Tıklandı", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("Gönderilen Arama Sonucu",query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("Harf Girdikçe",newText);
        return true;
    }
}