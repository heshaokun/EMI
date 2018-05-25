package demo.exmple.com.emidemo.activity;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.base.BaseActivity;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;

/**
 * Created by 贺韶坤 on 2018/5/23.
 */
//合作社详情页
public class Cooperativedetailspage_Activity extends BaseActivity<NetPresenter,NetModel> implements NetContract.View{

    @Override
    public void show(String res) {

    }
    @Override
    protected int getLayoutId() {
        return R.layout.cooperativedetailspage_activity;
    }
    @Override
    protected void initView() {

    }
}
