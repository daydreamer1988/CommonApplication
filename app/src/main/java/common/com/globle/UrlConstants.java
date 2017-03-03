package common.com.globle;


public class UrlConstants {

	/**
	 * 测试环境
	 */
	public static final String SURL = "http://192.168.0.106:8080/";


	/**
	 * 正式环境
     */

    /**
	 * 接口
	 * @return
     */
	public static String getShortMessage() {
		return SURL + "App/System/SendCode.html";
	}


	public static String phpTest() {
		return SURL + "project01";
	}
}

