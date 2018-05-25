package demo.exmple.com.emidemo.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import demo.exmple.com.emidemo.Fragment.BlankFragment;

/**
 * Created by 贺韶坤 on 2018/5/25.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    private List<String> list;

    public ViewPageAdapter(FragmentManager fm,List<String> list) {
        super(fm);
        this.list = list;
    }


    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance(list.get(position));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
