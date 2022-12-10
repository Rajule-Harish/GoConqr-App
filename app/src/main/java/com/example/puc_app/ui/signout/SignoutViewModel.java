package com.example.puc_app.ui.signout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SignoutViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public SignoutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sign Out fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}