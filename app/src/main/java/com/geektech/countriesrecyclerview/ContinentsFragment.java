package com.geektech.countriesrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.countriesrecyclerview.databinding.FragmentContinentsBinding;

import java.util.ArrayList;


public class ContinentsFragment extends Fragment {
    private FragmentContinentsBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        loadData();

        ContinentsAdapter continentsAdapter = new ContinentsAdapter(continentList);
        binding.rvContinents.setAdapter(continentsAdapter);
    }

    private void loadData() {
        continentList.add("Asia");
        continentList.add("Africa");
        continentList.add("Europe");
        continentList.add("North America");
        continentList.add("South America");
    }
}