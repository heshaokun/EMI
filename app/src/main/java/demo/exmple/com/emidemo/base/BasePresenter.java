package demo.exmple.com.emidemo.base;

/**
 * Created by 贺韶坤 on 2017/11/27.
 */

public abstract class BasePresenter<M, V> {
    public M baseModel;
    public V baseView;
    public void setVM(M m, V v){
        baseModel = m;
        baseView = v;
        this.onStart();
    }
    public abstract void onStart();

}
