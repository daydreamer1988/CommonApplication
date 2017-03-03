package common.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.VolleyError;

import common.com.activity.TitleBarActivity;
import common.com.commonapplication.R;
import common.com.http.ApiManager;
import common.com.http.VolleyInterface;

public class MainActivity extends TitleBarActivity {
    private TextView tv;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiManager.phpTest(MainActivity.this, new VolleyInterface<String>(String.class, "phpTest") {
                    @Override
                    public void onSuccess(String response) {
                        tv.setText(response);
                    }

                    @Override
                    public void onFail(VolleyError error) {

                    }
                });
            }
        });



    }

    @Override
    public String setTitle() {
        return "主页";
    }
}
