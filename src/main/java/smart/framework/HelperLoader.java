package smart.framework;

import smart.framework.helper.BeanHelper;
import smart.framework.helper.ClassHelper;
import smart.framework.helper.ControllerHelper;
import smart.framework.helper.IocHelper;
import smart.framework.utils.ClassUtil;

/**
 * 加载相应的Helper类
 * Created by Administrator on 2017/4/27.
 */
public final class HelperLoader {
    public static void init(){
        Class<?> []classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}
