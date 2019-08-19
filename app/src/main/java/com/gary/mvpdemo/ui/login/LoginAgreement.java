package com.gary.mvpdemo.ui.login;

import com.gary.mvpdemo.basemvp.BaseModel;
import com.gary.mvpdemo.basemvp.BasePresenter;
import com.gary.mvpdemo.basemvp.BaseView;

public interface LoginAgreement {

    //协议化LoginModel
    interface AgreementLoginModel extends BaseModel{

        boolean login(String account,String password,String code);

    }

    //协议化View层
    interface AgreementLoginView extends BaseView{
        //登陆成功
        void loginSuccess();
        //登陆失败
        void loginFailure();

        //登陆之前
        void loginBefore();
    }

    public abstract class AgreementLoginPresenter extends BasePresenter<AgreementLoginModel,AgreementLoginView>{
        abstract void login(String account,String password,String code);
    }

}
