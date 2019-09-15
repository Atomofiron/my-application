package io.atomofiron.myapplication;

import android.util.Log;

public class I {
    public static void log(Object o, String s) {
        String tag = BuildConfig.APPLICATION_ID.replaceAll(".*\\.", "");
        String context = o.getClass().getSimpleName();
        Log.e(tag, "[" + context + "] " + s);
    }
}
