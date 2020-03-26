package com.gzeinnumer.viewpagerexample.second;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TransactionFPA extends FragmentPagerAdapter {
    private int count = 0;
    private FirstViewpagerFragment firstViewpagerFragment;
    private SecondViewpagerFragment secondViewpagerFragment;

    public FirstViewpagerFragment getFirstViewpagerFragment() {
        return firstViewpagerFragment;
    }

    public SecondViewpagerFragment getSecondViewpagerFragment() {
        return secondViewpagerFragment;
    }

    public TransactionFPA(FragmentManager fragmentManager, int count) {
        super(fragmentManager,count);
        this.count = count;
        firstViewpagerFragment = new FirstViewpagerFragment();
        secondViewpagerFragment = new SecondViewpagerFragment();
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return firstViewpagerFragment;
        } else if(position == 1){
            return secondViewpagerFragment;
        }else {
            return firstViewpagerFragment;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
