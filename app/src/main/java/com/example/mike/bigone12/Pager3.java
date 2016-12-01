package com.example.mike.bigone12;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Mike on 8/19/2016.
 */
public class Pager3 extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager3(FragmentManager fm,int tabCount) {

        super(fm);
        this.tabCount=tabCount;
    }



    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Tab8 tab8= new Tab8();
                return tab8;
            case 1:
                Tab9 tab9= new Tab9();
                return tab9;
            case 2:
                Tab10 tab10= new Tab10();
                return tab10;

            case 3:
                Tab11 tab11= new Tab11();
                return tab11;
            case 4 :
                Tab12 tab12=new Tab12();
                return tab12;


            default:
                return null;


        }

    }

    @Override
    public int getCount() {

        return tabCount;
    }
}
