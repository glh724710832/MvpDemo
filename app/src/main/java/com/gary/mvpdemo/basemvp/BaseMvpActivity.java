package com.gary.mvpdemo.basemvp;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseMvpActivity<P extends BasePresenter> extends Activity implements BaseView {
    protected P mPresenter;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initMvp();
    }

    public abstract void initMvp();
}
