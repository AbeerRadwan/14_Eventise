package com.example.abeer.eventise2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SMSReceiver extends BroadcastReceiver {
@Override
    public void onReceive(Context context, Intent intent)
{
    Bundle bundle = intent.getExtras();
    SmsMessage[] msgs = null;
    String str = "";
    String ms = "";
    if (bundle != null)
    {
        // Retrieve SMS message
        Object[] pdus = (Object[]) bundle.get("pdus");
        msgs = new SmsMessage[pdus.length];
        for (int i = 0; i < msgs.length; i++) {
            msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
            str = msgs[i].getOriginatingAddress();
          //  str += " :";
            ms= msgs[i].getMessageBody().toString();
           // str += "\n";
        }
        // Display message
       // Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
      // Toast.makeText(context, "I RECEVIED : "+ms, Toast.LENGTH_SHORT).show();


        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction("SMS_RECEIVED_ACTION");
        broadcastIntent.putExtra("sms", str);
        broadcastIntent.putExtra("sms1", ms);
        context.sendBroadcast(broadcastIntent);


    }
}
}
