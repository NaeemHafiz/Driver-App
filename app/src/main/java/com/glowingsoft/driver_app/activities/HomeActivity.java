package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.view.Menu;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.glowingsoft.driver_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_bell, R.id.navigation_settings, R.id.navigation_profile)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        Menu menu = navView.getMenu();
        menu.findItem(R.id.navigation_home).setIcon((getResources().getDrawable(R.drawable.home_colored)));
        menu.findItem(R.id.navigation_bell).setIcon(getResources().getDrawable(R.drawable.bell_colored));
        menu.findItem(R.id.navigation_settings).setIcon(getResources().getDrawable(R.drawable.setttings_colored));
        menu.findItem(R.id.navigation_profile).setIcon(getResources().getDrawable(R.drawable.profile_colored));
    }
}
