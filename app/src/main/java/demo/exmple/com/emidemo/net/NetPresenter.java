package demo.exmple.com.emidemo.net;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class NetPresenter extends NetContract.Presenter{
    @Override
    public void getDataFromModel(String url) {
        baseModel.getDataFrom(url, new CallBacks() {
            @Override
            public void succ(String result) {
                baseView.show(result);
            }
        });
    }

    @Override
    public void onStart() {

    }
}