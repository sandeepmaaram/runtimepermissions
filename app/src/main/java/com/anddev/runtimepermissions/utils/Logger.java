package com.anddev.runtimepermissions.utils;

import android.util.Log;

/**
 * Created by sandeep on 7/12/2016.
 */
public class Logger {
    private static final String TAG = "===permissions==";

    public static void getInfo(String string) {
        Log.i(TAG, "===" + string + "===");
    }

    public static void getDebug(String string) {
        Log.d(TAG, "===" + string + "===");
    }

    public static void getError(String string) {
        Log.e(TAG, "===" + string + "===");
    }
}
