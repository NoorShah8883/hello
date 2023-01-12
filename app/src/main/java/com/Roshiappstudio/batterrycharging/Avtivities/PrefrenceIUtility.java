package com.Roshiappstudio.batterrycharging.Avtivities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefrenceIUtility
{
    Context mContext;
    SharedPreferences mPrefrences;

    public PrefrenceIUtility(Context mContext) {
        mPrefrences= PreferenceManager.getDefaultSharedPreferences(mContext);
    }

 

    public  void saveString(String key, String value){
        mPrefrences.edit().putString(key,value).commit();
    }

    public String getString(String key, String defaultValue){

      return mPrefrences.getString(key,defaultValue);
    }
    public  void saveInt(String key, int value){
        mPrefrences.edit().putInt(key,value).commit();
    }

    public  int getInt(String key, int defaultValue){

      return mPrefrences.getInt(key,defaultValue);
    }
    public  void saveFloat(String key, float value){
        mPrefrences.edit().putFloat(key,value).commit();
    }

    public  float getFloat(String key, float defaultValue){

      return mPrefrences.getFloat(key,defaultValue);
    }

    public  void saveBoolean(String key, Boolean value){
        mPrefrences.edit().putBoolean(key,value).commit();
    }

    public  boolean getBoolean(String key, Boolean defaultValue){

      return mPrefrences.getBoolean(key,defaultValue);
    }

}
