package com.ci123.moduledemo;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.List;

public class MyApplication extends Application {

    private static boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if(isDebug){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);

        String processName = getProcessName(this,android.os.Process.myPid());
        if(!TextUtils.isEmpty(processName)){
            boolean defaultProcess = processName.equals(getPackageName());
            Log.d("MyApplication", "onCreate: " + defaultProcess);
        }
    }

    private String getProcessName(Context context, int myPid) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> apps = activityManager.getRunningAppProcesses();
        if(apps == null)
            return null;
        for(ActivityManager.RunningAppProcessInfo info : apps){
            if(info.pid == myPid){
                return info.processName;
            }
        }
        return null;
    }
}
