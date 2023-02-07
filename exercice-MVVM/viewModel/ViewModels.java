package com.example.mvvp_activity.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvp_activity.model.Model;

public class ViewModels extends ViewModel {

    public MutableLiveData infoUser;

    private Model getInfoFromDataBase(){
        return new Model("ayoub@gmail.com",123456789);
    }

    public String getEmail(){
        String email = getInfoFromDataBase().getEmail();
        infoUser.setValue(email);
        return email;
    }

    public Integer getPassword(){
        Integer password = getInfoFromDataBase().getPassword();
        infoUser.setValue(password);
        return password;
    }
}
