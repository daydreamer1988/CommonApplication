package common.com.globle;

import android.os.Environment;

import java.io.File;

import common.com.commonapplication.R;

/**
 * ToDo:存储全局参数
 */
public interface Appconstants {

    /**
     * 网络签名
     */

    String URL_NAME_KEY = "name";
    String URL_KEY_KEY = "key";
    String URL_TIMESTAMP_KEY = "timestamp";
    String URL_SIGN_KEY = "sign";
    String URL_NAME = "dike";
    String URL_KEY = "123456";


    /**
     * SP
     */
    String SP_KEY_USER_ID = "user_id";
    String SP_KEY_USERNAME = "username";
    String SP_KEY_IS_LOGIN = "is_login";
    String SP_KEY_AUTHENTICATION = "authentication";
    String SP_IS_USERINFO_OK = "is_userinfo_ok";
    String SP_KEY_OBDID = "obdid";
    /**
     * 全局变量
     */
    String APP_SP = "AppSP";
    String APP_FILE_ROOT_PATH = Environment.getExternalStorageDirectory().getPath() + File.separator + "dikedriver" + File.separator;
    String APP_PIC_PATH = APP_FILE_ROOT_PATH + "pictures" + File.separator;
    int TITLE_BAR_COLOR = R.color.title_bar_bgcolor;


}
