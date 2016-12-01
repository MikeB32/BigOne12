package com.example.mike.bigone12;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Mike on 8/19/2016.
 */
public class Pager2 extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager2(FragmentManager fm,int tabCount) {

        super(fm);
        this.tabCount=tabCount;
    }



    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Tab4 tab4= new Tab4();
                return tab4;
            case 1:
                Tab5 tab5= new Tab5();
                return tab5;
            case 2:
                Tab6 tab6= new Tab6();
                return tab6;

            case 3:
                Tab7 tab7= new Tab7();
                return tab7;


            default:
                return null;


        }

    }

    @Override
    public int getCount() {

        return tabCount;
    }
}
