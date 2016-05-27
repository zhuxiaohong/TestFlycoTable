package com.zhuxiaohong.testflycotable;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Author: zhuxiaohong
 * Date: 2016/2/25 16:20
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    private String[] titleStrs;

    private ArrayList<Fragment> fragList = new ArrayList<>();
    public MyViewPagerAdapter(FragmentManager fm,ArrayList<Fragment> fragmentList,String[] titleStrs) {
        super(fm);
        fragList = fragmentList;
        this.titleStrs = titleStrs;
    }

    @Override
    public int getCount() {
        if ( null != fragList)
         return  fragList.size();

        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        return fragList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleStrs[position];
    }



}
