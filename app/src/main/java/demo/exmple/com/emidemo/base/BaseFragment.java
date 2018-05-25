package demo.exmple.com.emidemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.exmple.com.emidemo.utils.AppApplication;
import demo.exmple.com.emidemo.utils.TUtils;


/**
 * Created by 贺韶坤 on 2017/11/27.
 */

public abstract class BaseFragment<p extends BasePresenter, m extends BaseModel> extends Fragment {

    public p presenter;
    public m model;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        presenter = TUtils.getT(this, 0);
        model = TUtils.getT(this, 1);
        if (this instanceof BaseView) {
            presenter.setVM(model, this);
        }

        view = inflater.inflate(getLayoutIdFragment(), container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AppApplication.baseFragment = this;

        initView(view);
        initData();
    }

    protected abstract void initData();

    protected abstract int getLayoutIdFragment();

    protected abstract void initView(View view);
}