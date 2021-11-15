package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.allinone.Adapter.FragmentTabsAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabTestActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_test);

        FragmentTabsAdapter adapter = new FragmentTabsAdapter(getSupportFragmentManager(),getLifecycle());


        viewpager = findViewById(R.id.viewPager);
        viewpager.setAdapter(adapter);


        tabLayout = findViewById(R.id.tabLayout);

        tabLayout.getTabAt(0).setText("Fragment 1");
        tabLayout.getTabAt(1).setText("Fragment 2");

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}