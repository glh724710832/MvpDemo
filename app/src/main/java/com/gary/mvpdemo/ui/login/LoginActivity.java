package com.gary.mvpdemo.ui.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.gary.mvpdemo.R;
import com.gary.mvpdemo.basemvp.BaseMvpActivity;

public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements LoginAgreement.AgreementLoginView {


    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt = findViewById(R.id.bt_login);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBefore();
                mPresenter.login("ellen2018","1314","2456");
            }
        });
    }

    @Override
    public void loginSuccess() {
       bt.setText("登陆成功");
    }

    @Override
    public void loginFailure() {
        Log.e("Ellen登陆失败","请输入正确的账号和密码");
    }

    @Override
    public void loginBefore() {
        Log.e("Ellen登陆动画效果","显示高逼格的动画");
    }

    @Override
    public void initMvp() {
        mPresenter = new LoginPresenter();
        mPresenter.mModel = new LoginModel();
        mPresenter.mView = this;
    }
}
