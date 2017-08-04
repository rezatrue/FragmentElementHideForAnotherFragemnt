package android.exapmple.com.myapptestfragmentm2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by jAVA USER on 8/3/2017.
 */

class EmptyPagerAdapter extends FragmentPagerAdapter {
    private ViewPager pager;
    private static int pageCount=2;

    public EmptyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    public EmptyPagerAdapter(FragmentManager fm, ViewPager pager) {
        super(fm);
        this.pager=pager;
    }



    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return FragmentOne.newInstance(position + 1, position == getCount() - 1, pager);
            case 1:
                return FragmentTwo.newInstance(position + 1, position == getCount() - 1, pager);
            default:
                return FragmentOne.newInstance(position + 1, position == getCount() - 1, pager);
        }
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    public void setCount(int pageCount){
        this.pageCount =pageCount;
    }

}
