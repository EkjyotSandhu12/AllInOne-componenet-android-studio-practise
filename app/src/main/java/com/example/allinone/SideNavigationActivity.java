package com.example.allinone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class SideNavigationActivity extends AppCompatActivity {

    NavigationView nav; // child view of Drawer Layout, side navigation
    DrawerLayout drawerLayout; // Parent View for any navigation layout
    ActionBarDrawerToggle toggle; // for icon on toolbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_navigation);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = findViewById(R.id.sidenav);
        drawerLayout = findViewById(R.id.drawerlayout);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //to show icon
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher_foreground);

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.test1menu:
                        Toast.makeText(SideNavigationActivity.this, "test 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.test2menu:
                        Toast.makeText(SideNavigationActivity.this, "test 2", Toast.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.close();
                return true;
            }
        });
    }
}