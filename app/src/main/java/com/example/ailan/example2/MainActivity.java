package com.example.ailan.example2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MessageOpenHelper coh;
    ArrayList<Message> listOfMessage;
    ListView lv;

    MessageAdapter messageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);

        coh=new MessageOpenHelper(this);
        listOfMessage=new ArrayList<Message>();

        Log.d("mosh", "list size is " + listOfMessage.size());
        Log.d("mosh", MessageOpenHelper.CREATE_TABLE_MESSAGE);

        createMessages();


    }


    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
    public void createMessages()
    {
        coh.open();
        Message c1=new Message(0,"12/10/2018","19:43","howareyoubro ?","shaked");
        c1=coh.createMessage(c1);
        listOfMessage.add(c1);

        Message c2=new Message(0,"22/11/2017","14:25","whereareyou ?","eli");
        c2=coh.createMessage(c2);
        listOfMessage.add(c2);
        coh.close();
    }
}


