package com.prituladima.myapplication;

public interface Presenter<T extends IView> {

    void attachView(T view);

    void detachView();

}