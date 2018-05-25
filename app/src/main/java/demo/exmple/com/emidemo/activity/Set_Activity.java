package demo.exmple.com.emidemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import demo.exmple.com.emidemo.R;

/**
 * Created by 贺韶坤 on 2018/5/21.
 */
//设置页面
public class Set_Activity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar Set_Toolber;
    private TextView Set_tv;
    private TextView Set_tv2;
    private TextView Set_tv3;
    private TextView Set_tv4;
    private TextView Set_tv5;
    private ImageView Toolber_iv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setactivity);
        initView();
    }

    private void initView() {
        Set_Toolber = (Toolbar) findViewById(R.id.Set_Toolber);
        Set_tv = (TextView) findViewById(R.id.Set_tv);
        Set_tv2 = (TextView) findViewById(R.id.Set_tv2);
        Set_tv3 = (TextView) findViewById(R.id.Set_tv3);
        Set_tv4 = (TextView) findViewById(R.id.Set_tv4);
        Set_tv5 = (TextView) findViewById(R.id.Set_tv5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Set_Toolber);


        // 主标题
        toolbar.setTitle("");


        //设置toolbar
        setSupportActionBar(toolbar);

        //左边的小箭头（注意需要在setSupportActionBar(toolbar)之后才有效果）
//        toolbar.setNavigationIcon(R.mipmap.set_img);


        Toolber_iv = (ImageView) findViewById(R.id.Toolber_iv);
        Toolber_iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
