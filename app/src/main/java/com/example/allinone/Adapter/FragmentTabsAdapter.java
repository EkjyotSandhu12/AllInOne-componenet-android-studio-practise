package com.example.allinone.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.allinone.Fragment.FirstFragment;
import com.example.allinone.Fragment.SecondsFragment;
import com.example.allinone.R;

public class FragmentTabsAdapter extends FragmentStateAdapter {

    public FragmentTabsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){

            case 0: return new FirstFragment();
            case 1: return new SecondsFragment();
        }
        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
