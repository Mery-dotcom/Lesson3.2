package com.geeks.lesson32;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.lesson32.databinding.FragmentSecondBinding;
import com.geeks.lesson32.databinding.FragmentFirstBinding;


import java.io.Serializable;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            Serializable warrior = getArguments().getSerializable("warrior");
            String text = "Name: " + ((Warrior) warrior).getName() + "\n" +
                    "Health: " + ((Warrior) warrior).getHealth() + "\n" +
                    "Damage: " + ((Warrior) warrior).getDamage();
            binding.textView.setText(text);
        }
        if (getArguments() != null) {
            Serializable boss = getArguments().getSerializable("boss");
            String text = "Name: " + ((Boss) boss).getName() + "\n" +
                    "Health: " + ((Boss) boss).getHealth() + "\n" +
                    "Damage: " + ((Boss) boss).getDamage();
            binding.textView1.setText(text);
        }
    }
}