package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnChange (View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.frag1Btn:
                fragment = new Fragment1();
                break;
            case R.id.frag2Btn:
                fragment = new Fragment2();
                break;
        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.forFragments, fragment);
        ft.commit();
    }
}
