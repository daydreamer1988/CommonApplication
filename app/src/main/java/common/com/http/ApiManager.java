package common.com.http;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import common.com.globle.Appconstants;
import common.com.globle.UrlConstants;

/**
 * Created by Austin on 2016/10/28.
 */

public class ApiManager implements Appconstants {


    /**
     * 示例
     */
    /*
    public static void getShortMessage(Context context, String string, VolleyInterface<MessageResp> vi) {
        String url = UrlConstants.getShortMessage();
        Map<String, String> params = new HashMap<>();
        params.put("UserTel", string);
        RequestUtils.postJsonRequest(context, url, params, vi);
    }
    */

    public static void phpTest(Context context, VolleyInterface vi) {
        String url = UrlConstants.phpTest();
        Map<String, String> params = new HashMap<>();
        params.put("name", "austin");
        params.put("age", "3");
        RequestUtils.getStringRequest(context,url, params, vi);
    }

}
