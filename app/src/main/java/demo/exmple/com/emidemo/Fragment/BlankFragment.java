package demo.exmple.com.emidemo.Fragment;

import android.os.Bundle;
import android.view.View;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.base.BaseFragment;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;

/**
 * Created by 贺韶坤 on 2018/5/25.
 */
//保单列表Fragment
public class BlankFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View{
    @Override
    public void show(String res) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutIdFragment() {
        return R.layout.listofpolicies_fragment;
    }

    @Override
    protected void initView(View view) {

    }
    public BlankFragment() {
    }

    public static BlankFragment newInstance(String text){
        Bundle bundle = new Bundle();
        bundle.putString("text",text);
        BlankFragment blankFragment = new BlankFragment();
        blankFragment.setArguments(bundle);
        return  blankFragment;
    }
}
