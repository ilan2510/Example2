package com.example.ailan.example2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MessageOpenHelper coh;
    ArrayList<Message> listOfCustomer;
    ListView lv;

    MessageAdapter customerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);

        coh=new MessageOpenHelper(this);
        listOfCustomer=new ArrayList<Message>();

        Log.i("data", "list size is " + listOfCustomer.size());

        createCustomers();


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
    public void createCustomers()
    {
        coh.open();
        Message c1=new Message(0,"oren","davidi","tel-aviv","MOSHE");
        c1=coh.createCustomer(c1);
        listOfCustomer.add(c1);

        Message c2=new Message(0,"blibli","oli","ranat-aviv","MOSHE");
        c2=coh.createCustomer(c2);
        listOfCustomer.add(c2);
        coh.close();
    }
}


