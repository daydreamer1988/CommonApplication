package common.com.custom;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;

import common.com.commonapplication.R;


/**
 * Created by Austin on 2016/11/3.
 */

public class PgDialog {
    private int rscId;
    private String text;
    private boolean canclable;
    private AlertDialog dialog;


    public PgDialog(@NonNull Context context, String text, boolean canclable) {
        this.text = text;
        this.canclable = canclable;
        initDialog(context);
    }


    protected void initDialog(final Context context){
        dialog = new AlertDialog.Builder(context).create();
        dialog.show();
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        View view = LayoutInflater.from(context).inflate(R.layout.progress, null);
        dialog.setCancelable(canclable);
        window.setWindowAnimations(R.style.DialogAnimation);
        window.setContentView(view);

        ProgressBar pg;
        TextView text;

        pg = (ProgressBar) view.findViewById(R.id.pg);
        text = (TextView) view.findViewById(R.id.text);
        text.setText(this.text);
    }


    public void dismiss(){
        dialog.dismiss();
    }

    public boolean isShowing() {

        return dialog.isShowing();
    }

    public void myshow() {
        dialog.show();
    }
}
