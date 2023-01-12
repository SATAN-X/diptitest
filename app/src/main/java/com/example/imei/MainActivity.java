package com.example.imei;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView showid;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this,new  String[]{Manifest.permission.READ_PHONE_STATE}
        , PackageManager.PERMISSION_GRANTED);

        showid = findViewById(R.id.tv1);

    }

    public void imeiid (View view)
    {
        TelephonyManager telephonyManager=(TelephonyManager)  this.getSystemService(this.TELEPHONY_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            String   imeino = telephonyManager.getImei();
        }
    }




}