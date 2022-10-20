package com.geektech.countriesrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.countriesrecyclerview.databinding.ContinentsItemBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsAdapter.ContinentsViewHolder> {

    private ArrayList<String> continentList;

    public ContinentsAdapter(ArrayList<String> continentList) {
        this.continentList = continentList;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(ContinentsItemBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, int position) {
        holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }


    class ContinentsViewHolder extends RecyclerView.ViewHolder {
        private ContinentsItemBinding binding;

        public ContinentsViewHolder(@NonNull ContinentsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(String continent) {
            binding.tvContinentsName.setText(continent);
        }
    }

}
