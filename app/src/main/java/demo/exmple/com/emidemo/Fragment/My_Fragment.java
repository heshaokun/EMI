package demo.exmple.com.emidemo.Fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.activity.Customerinformation_Activity;
import demo.exmple.com.emidemo.activity.Listofpolicies_Activity;
import demo.exmple.com.emidemo.activity.NewCustomers_Activity;
import demo.exmple.com.emidemo.activity.Set_Activity;
import demo.exmple.com.emidemo.base.BaseFragment;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;


/**
 * Created by 贺韶坤 on 2018/5/15.
 */
//我的Fragment
public class My_Fragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    private TextView mMy_Set,mXinZen;
    private ImageView mMy_JT,mMy_JT2;
    private LinearLayout mLayout;

    @Override
    public void show(String res) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutIdFragment() {
        return R.layout.myfragment;
    }

    @Override
    protected void initView(View view) {
        mMy_Set = view.findViewById(R.id.My_SheZ);
        mMy_Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SheZ = new Intent(getContext(), Set_Activity.class);
                startActivity(SheZ);
            }
        });
        mMy_JT = view.findViewById(R.id.My_JT);
        mMy_JT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JT = new Intent(getContext(), Customerinformation_Activity.class);
                startActivity(JT);
            }
        });
        mMy_JT2 = view.findViewById(R.id.My_JT2);
        mMy_JT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JT2 = new Intent(getContext(), Listofpolicies_Activity.class);
                startActivity(JT2);
            }
        });
        mLayout = view.findViewById(R.id.My_layout);
        mXinZen = view.findViewById(R.id.XinZen);
        mXinZen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent XinZen = new Intent(getContext(), NewCustomers_Activity.class);
                startActivity(XinZen);
            }
        });
//        mLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.My_SheZ:
//
//                        break;
//                    case R.id.My_JT:
//
//                        break;
//                    case R.id.XinZen:
//
//                }
//            }
//        });
    }
}
