package demo.exmple.com.emidemo.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/******************************************
 * 类名称：TUtils
 * 类描述：泛型实例化工具类
 ******************************************/
public class TUtils {


    private static Class<?> oClass;
    private static Type superclass;
    private static Type[] arguments;

    public static  <T>T  getT(Object o, int i){


        try {
            oClass = o.getClass();
            superclass = oClass.getGenericSuperclass();
            arguments = ((ParameterizedType) superclass).getActualTypeArguments();
            Type t=arguments[i];
            return ((Class<T>)t).newInstance();


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
