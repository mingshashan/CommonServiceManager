package com.zero.core.example;

import android.app.Activity;
import android.os.RemoteException;
import android.os.Bundle;

import com.zero.core.CoreServiceManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IStopPackage i = (IStopPackage) CoreServiceManager.getService(StopPackageService.SERVICE_ID);
        try {
            i.killSysNoWait();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
