package smart.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/6/9.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
