package smart.framework.proxy;

/**
 * Created by Administrator on 2017/6/9.
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws  Throwable;
}
