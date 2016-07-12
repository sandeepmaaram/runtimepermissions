package com.anddev.runtimepermissions.utils;

import android.content.Context;

/**
 * Created by sandeep on 7/12/2016.
 */
public class Toast {
    public static void makeToast(Context context, String message) {
        android.widget.Toast.makeText(context, message, android.widget.Toast.LENGTH_SHORT);
    }
}
