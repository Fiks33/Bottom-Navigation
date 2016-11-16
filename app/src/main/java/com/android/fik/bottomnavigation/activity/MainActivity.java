package com.android.fik.bottomnavigation.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.fik.bottomnavigation.R;
import com.android.fik.bottomnavigation.fragment.FiveFragment;
import com.android.fik.bottomnavigation.fragment.FourFragment;
import com.android.fik.bottomnavigation.fragment.OneFragment;
import com.android.fik.bottomnavigation.fragment.ThreeFragment;
import com.android.fik.bottomnavigation.fragment.TwoFragment;

/**
 * Created by Mochamad Taufik on 15-Nov-16.
 * Email   : thidayat13@gmail.com
 */

public class MainActivity  extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.frame_container, new OneFragment());
        tx.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_one:
                                OneFragment fragment1 = new OneFragment();
                                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                                transaction.replace(R.id.frame_container, fragment1);
                                transaction.commit();
                                break;

                            case R.id.action_two:
                                TwoFragment fragment2 = new TwoFragment();
                                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                                transaction2.replace(R.id.frame_container, fragment2);
                                transaction2.commit();
                                break;

                            case R.id.action_three:
                                ThreeFragment fragment3 = new ThreeFragment();
                                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                                transaction3.replace(R.id.frame_container, fragment3);
                                transaction3.commit();
                                break;

                            case R.id.action_four:
                                FourFragment fragment4 = new FourFragment();
                                FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                                transaction4.replace(R.id.frame_container, fragment4);
                                transaction4.commit();
                                break;

                            case R.id.action_five:
                                FiveFragment fragment5 = new FiveFragment();
                                FragmentTransaction transaction5 = getSupportFragmentManager().beginTransaction();
                                transaction5.replace(R.id.frame_container, fragment5);
                                transaction5.commit();
                                break;
                        }
                        return false;
                    }
                });
    }
}
