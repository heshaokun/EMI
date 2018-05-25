package demo.exmple.com.emidemo.net;


import demo.exmple.com.emidemo.base.BaseModel;
import demo.exmple.com.emidemo.base.BasePresenter;
import demo.exmple.com.emidemo.base.BaseView;

/**
 * Created by 贺韶坤 on 2017/11/27.
 */

public class NetContract extends BasePresenter {

    @Override
    public void onStart() {

    }

    public interface View extends BaseView {
        void show(String res);
    }

    interface Model extends BaseModel {
        void getDataFrom(String url, CallBacks callBacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {


        public abstract void getDataFromModel(String url);

        
    }
}