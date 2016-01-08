package com.iqbal.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

import java.util.Map;
import java.util.Set;

/**
 * Created by iqbal.pribadi@yahoo.com on 12/23/15.
 */
public class StoredPreferences {

    public StoredPreferences(){

    }

    public String getPackageName(Context context) {
        return context.getPackageName();
    }
}
