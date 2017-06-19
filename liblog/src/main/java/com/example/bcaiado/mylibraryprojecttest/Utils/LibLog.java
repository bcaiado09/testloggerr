package com.example.bcaiado.mylibraryprojecttest.Utils;

import com.example.bcaiado.mylibraryprojecttest.BuildConfig;

/**
 * Created by brunocaiado on 08/06/17.
 */

public class LibLog {

    private static final boolean LIVE = !BuildConfig.RELEASE_MODE;
    private static final String _tag = "wwq";

    /**
     * Log in debug
     * @param tag Custom tag
     * @param msg Custom message
     */
    public static void d(String tag, String msg) {
        if (LIVE) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String msg) {
        if (LIVE) {
            android.util.Log.d(_tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (LIVE) {
            android.util.Log.v(tag, msg);
        }
    }

    public static void v(String msg) {
        if (LIVE) {
            android.util.Log.v(_tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LIVE) {
            android.util.Log.e(tag, msg);
        }
    }

    public static void e(String msg) {
        if (LIVE) {
            android.util.Log.e(_tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LIVE) {
            android.util.Log.i(tag, msg);
        }
    }

    public static void i(String msg) {
        if (LIVE) {
            android.util.Log.i(_tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LIVE) {
            android.util.Log.w(tag, msg);
        }
    }

    public static void w(String msg) {
        if (LIVE) {
            android.util.Log.w(_tag, msg);
        }
    }

}
