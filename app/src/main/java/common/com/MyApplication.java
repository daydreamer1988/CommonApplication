package common.com;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

import common.com.globle.Appconstants;

/**
 * Created by Austin on 2016/10/28.
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    private SharedPreferences sp;

    private RequestQueue requestQueue;
    private SharedPreferences.Editor editor;

    private static List<FragmentActivity> activities;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        sp = getSharedPreferences(Appconstants.APP_SP, MODE_PRIVATE);

        editor = sp.edit();

        requestQueue = Volley.newRequestQueue(getApplicationContext());

        activities = new ArrayList<>();

    }

    public static void addActity(FragmentActivity activity) {
        activities.add(activity);
    }

    public static void exitApp(){
        for (FragmentActivity activity : activities) {
            if (activity != null) {
                activity.finish();
            }
        }

        System.exit(0);
    }

    public static MyApplication getInstance() {
        if (null == instance) {
            instance = new MyApplication();
        }
        return instance;
    }


    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public SharedPreferences.Editor getEditor() {
        return editor;
    }

    public SharedPreferences getSp() {
        return sp;
    }


    public void updateSp(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void updateSp(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }
}
