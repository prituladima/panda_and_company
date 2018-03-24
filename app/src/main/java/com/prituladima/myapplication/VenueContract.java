package com.prituladima.myapplication;

import java.util.List;

import rx.Observable;

public interface VenueContract {

    interface View extends IView{



        void onLoadResult(int res);



        void onDataSetChanged(List<Pin> data);


        void onNoDataError();

        void onServerConnectionError();

        void onNoInternetConnectionError();

    }

    interface UserActionListener {

        void loadData(double lat, double lon, int rad);

        void updateView();



        void savePin(Long id);


    }


    interface VenueRepository {

        Observable<List<Pin>> get(double lat, double lon, int rad);

        Observable<List<Pin>> sync(double lat, double lon, int rad);

    }
}
