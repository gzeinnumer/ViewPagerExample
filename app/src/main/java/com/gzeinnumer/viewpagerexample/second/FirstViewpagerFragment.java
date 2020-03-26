package com.gzeinnumer.viewpagerexample.second;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gzeinnumer.viewpagerexample.R;
import com.gzeinnumer.viewpagerexample.databinding.FragmentFirstViewpagerBinding;

public class FirstViewpagerFragment extends Fragment {

    private FragmentFirstViewpagerBinding binding;
    public FirstViewpagerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstViewpagerBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
