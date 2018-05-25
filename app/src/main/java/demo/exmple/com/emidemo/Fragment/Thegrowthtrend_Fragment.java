package demo.exmple.com.emidemo.Fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import demo.exmple.com.emidemo.R;
import demo.exmple.com.emidemo.base.BaseFragment;
import demo.exmple.com.emidemo.net.NetContract;
import demo.exmple.com.emidemo.net.NetModel;
import demo.exmple.com.emidemo.net.NetPresenter;


/**
 * Created by 贺韶坤 on 2018/5/15.
 */
//长势Fragment
public class Thegrowthtrend_Fragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View, SearchView.OnQueryTextListener {

    private SearchView sv;
private RecyclerView mRecy;
    // 自动完成的列表
    private final String[] mStrings = { "aaaaa", "bbbbbb", "cccccc", "ddddddd" };
    @Override
    public boolean onQueryTextSubmit(String query) {
        // 实际应用中应该在该方法内执行实际查询
        // 此处仅使用Toast显示用户输入的查询内容
        Toast.makeText(getContext(), "您的选择是:" + query, Toast.LENGTH_SHORT).show();
        return false;
    }


    // 用户输入字符时激发该方法
    @Override
    public boolean onQueryTextChange(String newText) {
        Toast.makeText(getContext(), "textChange--->" + newText, Toast.LENGTH_SHORT).show();
        if (TextUtils.isEmpty(newText)) {
            // 清除ListView的过滤
//            mRecy.clearTextFilter();

        } else {
            // 使用用户输入的内容对ListView的列表项进行过滤
//            mRecy.setFilterText(newText);
        }
        return true;

    }

    @Override
    public void show(String res) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutIdFragment() {
        return R.layout.thegrowthtrendfragment;
    }

    @Override
    protected void initView(View view) {
//        mRecy = (RecyclerView) view.findViewById(R.id.The_Recy);
////        mRecy.setAdapter(new ThegrowthtrendFragmentAdapter(getContext(), List<String>));
////        mRecy.setAdapter(new ArrayAdapter<string>(this,android.R.layout.simple_list_item_1, mStrings));
////        mRecy.setTextFilterEnabled(true);//设置lv可以被过虑
//        sv = (SearchView)view.findViewById(R.id.sv_cus);
//        // 设置该SearchView默认是否自动缩小为图标
//        sv.setIconifiedByDefault(false);
//        // 为该SearchView组件
//        // vk设置事件监听器
//        sv.setOnQueryTextListener(this);
//        // 设置该SearchView显示搜索按钮
//        sv.setSubmitButtonEnabled(true);
//        // 设置该SearchView内默认显示的提示文本
//        sv.setQueryHint("查找");
    }
}
