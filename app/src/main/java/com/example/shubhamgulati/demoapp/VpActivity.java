package com.example.shubhamgulati.demoapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VpActivity extends AppCompatActivity {

    ViewPager vp1,vp2;
    TabLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp);
        vp2=findViewById(R.id.vp2);
        tl=findViewById(R.id.tl);
        vp2.setAdapter(new MyPager2(getSupportFragmentManager()));
        tl.setupWithViewPager(vp2);
        vp2.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {

                if (position < -1 || position > 1) {
                    page.setAlpha(0);
                }
                else if (position <= 0 || position <= 1) {
                    // Calculate alpha. Position is decimal in [-1,0] or [0,1]
                    float alpha = (position <= 0) ? position + 1 : 1 - position;
                    page.setAlpha(alpha);
                }
                else if (position == 0) {
                    page.setAlpha(1);
                }
            }
        });
    }



    private class MyPager2 extends FragmentPagerAdapter {
        public MyPager2(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){

                case 0:
                    C FragC=new C();
                    return FragC;
                case 2:
                    D FragD=new D();
                    return FragD;
                case 1:
                    A FragA=new A();
                    return FragA;
            }
            return null;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "One";
                case 1:
                    return "Two";
                case 2:
                    return "Three";

            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
