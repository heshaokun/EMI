package demo.exmple.com.emidemo.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.base.BaseActivity;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;

/**
 * Created by 贺韶坤 on 2018/5/22.
 */
//新建客户页面
public class NewCustomers_Activity extends BaseActivity<NetPresenter,NetModel> implements NetContract.View{
    private Button mLay_btn;
    @Override
    public void show(String res) {

    }



    @Override
    protected int getLayoutId() {
        return R.layout.layout;
    }
    @Override
    protected void initView() {
        mLay_btn = findViewById(R.id.Lay_btn);
        mLay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(NewCustomers_Activity.this,XinJian_ChengGong.class);
                startActivity(in);
            }
        });
    }
}
