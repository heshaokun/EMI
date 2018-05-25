package demo.exmple.com.emidemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import demo.exmple.com.emidemo.utils.AppApplication;
import demo.exmple.com.emidemo.utils.TUtils;


/**
 * Created by 贺韶坤 on 2017/11/27.
 */

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel>extends AppCompatActivity {
    public P mPresenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        AppApplication.baseActivity = this;
        mPresenter = TUtils.getT(this, 0);
        mModel = TUtils.getT(this, 1);
        if (this instanceof BaseView) {
            mPresenter.setVM(mModel, this);
        }
        initView();
    }

    protected abstract void initView();

    protected abstract int getLayoutId();
}
