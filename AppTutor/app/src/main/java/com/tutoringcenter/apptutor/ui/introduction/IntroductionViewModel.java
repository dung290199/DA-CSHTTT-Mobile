package com.tutoringcenter.apptutor.ui.introduction;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IntroductionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IntroductionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}