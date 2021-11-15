package com.example.allinone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import com.example.allinone.Adapter.FragmentTabsAdapter;
import com.example.allinone.Fragment.FirstFragment;
import com.example.allinone.Fragment.SecondsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;

public class BottomNavActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        nav = findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.bottomFragLayout,new FirstFragment()).commit();
        nav.setSelectedItemId(R.id.firstFragment);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                switch (item.getItemId()) {
                    case R.id.firstFragment: fragment = new FirstFragment();

                    break;

                    case R.id.secondFragment: fragment = new SecondsFragment();
                    break;

                    default: fragment = new SecondsFragment();
                    break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.bottomFragLayout,fragment).commit();

            return true;
            }
        });


    }
}