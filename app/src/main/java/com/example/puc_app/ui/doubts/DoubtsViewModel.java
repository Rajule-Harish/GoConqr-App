package com.example.puc_app.ui.doubts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoubtsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DoubtsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is doubt fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}