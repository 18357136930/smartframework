package smart.framework.helper;

import org.apache.commons.collections4.CollectionUtils;
import smart.framework.annotation.Inject;
import smart.framework.utils.ArrayUtil;
import smart.framework.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/**
 * 依赖注入助手类
 * Created by Administrator on 2017/4/26.
 */
public final class IocHelper {
    static {
        Map<Class<?>,Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtils.isNotEmpty((Collection<Map<Class<?>,Object>>)beanMap)){
            for (Map.Entry<Class<?>,Object> beanEntry:beanMap.entrySet()){
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field []beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)){
                    for (Field beanField : beanFields){
                        if(beanField.isAnnotationPresent(Inject.class)){
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null){
                                ReflectionUtil.setField(beanInstance,beanField,beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
