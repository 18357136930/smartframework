package smart.framework.proxy;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 链式代理类
 * Created by Administrator on 2017/6/9.
 */
public class ProxyChain {
    private final Class<?> targetClass;
    private final Object tartgetObject;
    private final Method tartgetMethod;
    private final MethodProxy methodProxy;
    private final Object[] methodParams;
    private List<Proxy> proxyList = new ArrayList<Proxy>();
    private int proxyIndex=0;

    public ProxyChain(Class<?> targetClass,
                      Object tartgetObject,
                      Method tartgetMethod,
                      MethodProxy methodProxy,
                      Object[] methodParams,
                      List<Proxy> proxyList) {
        this.targetClass = targetClass;
        this.tartgetObject = tartgetObject;
        this.tartgetMethod = tartgetMethod;
        this.methodProxy = methodProxy;
        this.methodParams = methodParams;
        this.proxyList = proxyList;
    }

    public Object doProxyChain()throws Throwable{
        Object methodResult;
        if(proxyIndex < proxyList.size()){
            methodResult = proxyList.get(proxyIndex++).doProxy(this);
        }else{
            methodResult = methodProxy.invokeSuper(tartgetObject,methodParams);
        }
        return methodResult;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public Method getTartgetMethod() {
        return tartgetMethod;
    }

    public Object[] getMethodParams() {
        return methodParams;
    }
}
