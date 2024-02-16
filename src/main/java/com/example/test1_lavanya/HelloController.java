package com.example.test1_lavanya;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    private static final String originalUsername="Lavanya";
    private static final String originalPassword="abc123";
    public Label messageLabel;
    public TextField username;
    public TextField password;

    private int failedTries=0;

    public void login() throws Exception {
        if(failedTries>=5){
            messageLabel.setText("Account is blocked");
            return;
        }
        if(checkValues()){
            messageLabel.setText("Please Provide username or password");

            return;
        }

        if(verifyUser()){
            messageLabel.setText("Success!!!");
            resetTries();
        }
        else{
            messageLabel.setText("Sorry, Invalid Username or Password");
            failedTries+=1;

        }
//        System.out.println(failedTries);
    }
    public boolean checkValues(){
        String username_ = this.username.getText();
        String password_= this.password.getText();

        if(username_=="" || password_==""){
            return true;
                  }
        return false;

    }

    public boolean verifyUser(){
        String username_ = this.username.getText();
        String password_= this.password.getText();

        if(username_.equals(originalUsername) && password_.equals(originalPassword)){
            return  true;
        }
        return  false;
    }

    public void resetTries(){
        failedTries=0;
    }

}