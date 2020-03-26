package com.gzeinnumer.viewpagerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.gzeinnumer.viewpagerexample.databinding.ActivityMainBinding;
import com.gzeinnumer.viewpagerexample.second.SecondFragment;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.second_fragment, new SecondFragment());
        ft.commit();
    }
}
