package com.gary.mvpdemo.ui.login;

public class LoginModel implements LoginAgreement.AgreementLoginModel {

    @Override
    public boolean login(String account, String password, String code) {
          if(account.equals("ellen2018") && password.equals("1314")){
              //登陆成功
              return true;
          }else {
              //登陆失败
              return false;
          }
    }
}
