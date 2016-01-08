package com.iqbal.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by iqbal.pribadi@yahoo.com on 12/23/15.
 */
public class StoredPreferences {
    SharedPreferences sharedpreferences;

    public StoredPreferences(Context context){
        sharedpreferences = context.getSharedPreferences(getPackageName(context), Context.MODE_PRIVATE);
    }

    public String getPackageName(Context context) {
        return context.getPackageName();
    }


    public void saveData(String key, String value){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void saveData(String key, int value){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public void saveData(String key, long value){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public void saveData(String key, float value){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public void saveData(String key, List<String> value){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        Set<String> set = new HashSet<String>();
        set.addAll(value);
        editor.putStringSet(key, set);
        editor.commit();
    }

    public String getDataString(String key){
        return sharedpreferences.getString(key,"");
    }

    public int getDataInt(String key){
        return sharedpreferences.getInt(key,0);
    }

    public long getDataLong(String key){
        return sharedpreferences.getLong(key, 0);
    }

    public float getDataFloat(String key){
        return sharedpreferences.getFloat(key, 0);
    }

    public Set<String> getDataSetString(String key){
        return sharedpreferences.getStringSet(key, null);
    }

}
