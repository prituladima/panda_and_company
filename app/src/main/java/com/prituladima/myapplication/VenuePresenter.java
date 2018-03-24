package com.prituladima.myapplication;

import java.util.List;

import rx.functions.Action1;

public class VenuePresenter implements VenueContract.UserActionListener, Presenter<VenueContract.View> {


    VenueContract.View view;

    VenueContract.VenueRepository repository;

    @Override
    public void attachView(VenueContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void loadData(double lat, double lon, int rad) {
        repository.sync(lat, lon, rad)
                .subscribe(new Action1<List<Pin>>() {
                    @Override
                    public void call(List<Pin> pins) {
                        view.onDataSetChanged(pins);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });
    }

    @Override
    public void updateView() {

    }

    @Override
    public void savePin(Long id) {

    }
}
