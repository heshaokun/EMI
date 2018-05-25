package demo.exmple.com.emidemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import demo.exmple.com.emidemo.Fragment.HomePage_Fragment;
import demo.exmple.com.emidemo.Fragment.My_Fragment;
import demo.exmple.com.emidemo.Fragment.Thegrowthtrend_Fragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mMain_Frame;
    private RadioButton mMain_Radio_btn1;
    private RadioButton mMain_Radio_btn2;
    private RadioButton mMain_Radio_btn3;
    private RadioGroup mMain_Radio;
    private FragmentManager supportFragmentManager;
    private HomePage_Fragment homePageFragment;
    private Thegrowthtrend_Fragment thegrowthtrendFragment;
    private My_Fragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mMain_Frame = (FrameLayout) findViewById(R.id.main_Frame);
        mMain_Radio_btn1 = (RadioButton) findViewById(R.id.main_Radio_btn1);
        mMain_Radio_btn2 = (RadioButton) findViewById(R.id.main_Radio_btn2);
        mMain_Radio_btn3 = (RadioButton) findViewById(R.id.main_Radio_btn3);
        mMain_Radio = (RadioGroup) findViewById(R.id.main_Radio);
        supportFragmentManager = getSupportFragmentManager();
        homePageFragment = new HomePage_Fragment();
        thegrowthtrendFragment = new Thegrowthtrend_Fragment();
        myFragment = new My_Fragment();
        mMain_Radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.main_Radio_btn1:
                        FragmentTransaction transaction = supportFragmentManager.beginTransaction();
                        transaction.replace(R.id.main_Frame, homePageFragment);
                        transaction.commit();
                        break;
                    case R.id.main_Radio_btn2:
                        FragmentTransaction transaction2 = supportFragmentManager.beginTransaction();
                        transaction2.replace(R.id.main_Frame, thegrowthtrendFragment);
                        transaction2.commit();
                        break;
                    case R.id.main_Radio_btn3:
                        FragmentTransaction transaction3 = supportFragmentManager.beginTransaction();
                        transaction3.replace(R.id.main_Frame, myFragment);
                        transaction3.commit();
                        break;
                }
            }
        });
    }
}
