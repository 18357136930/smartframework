package smart.framework.helper;

import smart.framework.constant.ConfigCanstant;
import smart.framework.utils.PropsUtil;

import java.util.Properties;

/**
 * Created by Administrator on 2017/3/6.
 */
public class ConfigHelper {
    private static final Properties CONFIG_PROPS= PropsUtil.loadProps(ConfigCanstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     * @return
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC路径
     * @return
     */
    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.JDBC_URL);
    }

    /**
     * 获取JDBC用户名
     * @return
     */
    public static String getJdbcUsername(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC密码
     * @return
     */
    public static String getJdbcPassword(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getAppBasePackage(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取JSP路径
     * @return
     */
    public static String getAppJspPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.APP_JSP_PATH,"/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     * @return
     */
    public static String getAppAssetPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigCanstant.APP_ASSET_PATH,"/asset/");
    }
}
