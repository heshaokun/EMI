package demo.exmple.com.emidemo.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.base.BaseActivity;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;

/**
 * Created by 贺韶坤 on 2018/5/22.
 */
//客户资料页面
public class Customerinformation_Activity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {
    private TextView mXian;
    private TextView mTheGrowth_Xian;

    @Override
    public void show(String res) {


    }



    @Override
    protected int getLayoutId() {
        return R.layout.customerinformation_activity;
    }
    @Override
    protected void initView() {
mTheGrowth_Xian = findViewById(R.id.TheGrowth_Xian);
        mTheGrowth_Xian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Customerinformation_Activity.this,Cooperativedetailspage_Activity.class);
                startActivity(in);
            }
        });
    }
}
