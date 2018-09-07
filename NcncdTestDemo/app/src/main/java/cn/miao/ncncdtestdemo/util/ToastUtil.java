package cn.miao.ncncdtestdemo.util;

import android.content.Context;
import android.widget.Toast;

/**
 *  Toast
 * Created by zhangzhuang on 17/11/10.
 */

public class ToastUtil {

    private static Toast toast;

    public static void show(Context context, CharSequence text) {
        cancel();
        toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void cancel() {

        if (toast != null) {
            toast.cancel();
        }
    }
}
