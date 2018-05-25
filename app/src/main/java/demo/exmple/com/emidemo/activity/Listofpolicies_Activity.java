package demo.exmple.com.emidemo.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.adapter.ViewPageAdapter;
import demo.exmple.com.emidemo.base.BaseActivity;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;

/**
 * Created by 贺韶坤 on 2018/5/25.
 */
//保单列表
public class Listofpolicies_Activity extends BaseActivity<NetPresenter,NetModel> implements NetContract.View{
    private TabLayout tab;
    private ViewPager pager;
    private List<String> list;
    @Override
    public void show(String res) {

    }
    @Override
    protected int getLayoutId() {
        return R.layout.listofpolicies_activity;
    }
    @Override
    protected void initView() {
        this.pager = (ViewPager) findViewById(R.id.pager);
        this.tab = (TabLayout) findViewById(R.id.tab);
        initData();
        pager.setAdapter(new ViewPageAdapter(getSupportFragmentManager(),list));
        /*Tab与ViewPager绑定*/
        tab.setupWithViewPager(pager);

    }
    private void initData() {
        list = new ArrayList<>();
        list.add(String.format(Locale.CHINA, "审核中"));
        list.add(String.format(Locale.CHINA, "已生效"));
        list.add(String.format(Locale.CHINA, "已失效"));

    }
}
