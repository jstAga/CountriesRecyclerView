package com.geektech.countriesrecyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.countriesrecyclerview.databinding.FragmentCountriesBinding;

import java.util.ArrayList;

public class CountriesFragment extends Fragment {

    private FragmentCountriesBinding binding;
    private ArrayList<Country> countryList = new ArrayList<>();
    private CountriesAdapter countriesAdapter;
    private int pos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int pos = getArguments().getInt("key");

        checkPos(pos);

        countriesAdapter = new CountriesAdapter(countryList);
        binding.rvCountries.setAdapter(countriesAdapter);
    }

    private void checkPos(int pos) {
        if (pos == 0) {
            loadAsia();
        }

        if (pos == 1){
            loadAfrica();
        }

        if (pos == 2) {
            loadEurope();
        }

        if (pos == 3) {
            loadNorthAmerica();
        }

        if (pos == 4){
            loadSouthAmerica();
        }
    }

    private void loadAsia() {
        countryList.add(new Country("Thailand", "https://cdn-icons-png.flaticon.com/512/197/197452.png"));
        countryList.add(new Country("Kyrgyzstan", "https://cdn-icons-png.flaticon.com/512/197/197428.png"));
        countryList.add(new Country("Kazakhstan", "https://cdn-icons-png.flaticon.com/512/197/197603.png"));
        countryList.add(new Country("Taiwan", "https://cdn-icons-png.flaticon.com/512/197/197557.png"));
        countryList.add(new Country("Mongolia", "https://cdn-icons-png.flaticon.com/512/197/197473.png"));
    }

    private void loadAfrica() {
        countryList.add(new Country("Morocco", "https://cdn-icons-png.flaticon.com/512/197/197551.png"));
        countryList.add(new Country("Ecuador", "https://cdn-icons-png.flaticon.com/512/197/197588.png"));
        countryList.add(new Country("Zimbabwe", "https://cdn-icons-png.flaticon.com/512/197/197394.png"));
        countryList.add(new Country("Yemen", "https://cdn-icons-png.flaticon.com/512/197/197417.png"));
        countryList.add(new Country("Egypt", "https://cdn-icons-png.flaticon.com/512/197/197558.png"));
    }

    private void loadEurope() {
        countryList.add(new Country("Russia", "https://cdn-icons-png.flaticon.com/512/197/197408.png"));
        countryList.add(new Country("Switzerland", "https://cdn-icons-png.flaticon.com/512/197/197540.png"));
        countryList.add(new Country("Netherlands", "https://cdn-icons-png.flaticon.com/512/197/197441.png"));
        countryList.add(new Country("Germany", "https://cdn-icons-png.flaticon.com/512/197/197571.png"));
        countryList.add(new Country("Ukraine", "https://cdn-icons-png.flaticon.com/512/197/197572.png"));
    }

    private void loadNorthAmerica() {
        countryList.add(new Country("USA", "https://cdn-icons-png.flaticon.com/512/197/197484.png"));
        countryList.add(new Country("Canada", "https://cdn-icons-png.flaticon.com/512/197/197430.png"));
        countryList.add(new Country("Mexico", "https://cdn-icons-png.flaticon.com/512/197/197397.png"));
    }

    private void loadSouthAmerica() {
        countryList.add(new Country("Brazil", "https://cdn-icons-png.flaticon.com/512/197/197386.png"));
        countryList.add(new Country("Bolivia", "https://cdn-icons-png.flaticon.com/512/197/197504.png"));
        countryList.add(new Country("Venezuela", "https://cdn-icons-png.flaticon.com/512/197/197580.png"));
        countryList.add(new Country("Argentina", "https://cdn-icons-png.flaticon.com/512/197/197573.png"));
        countryList.add(new Country("Columbia", "https://cdn-icons-png.flaticon.com/512/323/323343.png"));
    }
}