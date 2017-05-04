package smart.framework.bean;

import smart.framework.utils.CastUtil;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/28.
 */
public class Param {
    private Map<String,Object> paramMap;

    public Param(Map<String,Object> paramMap){
        this.paramMap=paramMap;
    }

    /**
     * 根据参数名获取long型值
     * @param name
     * @return
     */
    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
