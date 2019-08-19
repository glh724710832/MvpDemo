package com.gary.mvpdemo.ui.login;

public class LoginPresenter extends LoginAgreement.AgreementLoginPresenter {
    @Override
    void login(String account, String password, String code) {
         //这个地方不能这么写，因为有些网络请求是在子线程当中的，所以必须使用RxJava完成子线程切换主线程逻辑
         boolean falg = mModel.login(account,password,code);
         if(falg){
             //登陆成功
             mView.loginSuccess();
         }else {
             //登陆失败
             mView.loginFailure();
         }
    }
}
