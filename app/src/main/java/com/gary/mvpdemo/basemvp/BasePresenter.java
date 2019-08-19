package com.gary.mvpdemo.basemvp;

public class BasePresenter<M extends BaseModel,V extends BaseView> {

    public M mModel;
    public V mView;

}
