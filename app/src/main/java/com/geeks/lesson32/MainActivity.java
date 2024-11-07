package com.geeks.lesson32;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geeks.lesson32.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view, FirstFragment.class, null)
                .commit();
    }
}

// Создать 2 Fragment и построить навигацию между ними. Передать класс warrior (Персонаж).
// Логика 1 месяц и 8 урок