package com.prituladima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements VenueContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public void onLoadResult(int res) {
        ((TextView)findViewById(R.id.result)).setText(String.valueOf(res));//:)
    }

    @Override
    public void onDataSetChanged(List<Pin> data) {
        ///Убрать загрузку

        ////
    }

    @Override
    public void onNoDataError() {

    }

    @Override
    public void onServerConnectionError() {

    }

    @Override
    public void onNoInternetConnectionError() {

    }
}
