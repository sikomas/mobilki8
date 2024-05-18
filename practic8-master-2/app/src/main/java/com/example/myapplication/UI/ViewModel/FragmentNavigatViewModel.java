package com.example.myapplication.UI.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.DATA.Model.FragmentNavigatData;

public class FragmentNavigatViewModel extends ViewModel {

    private MutableLiveData<FragmentNavigatData> data = new MutableLiveData<>();
    public FragmentNavigatViewModel() {
        data.setValue(new FragmentNavigatData());
    }
    public MutableLiveData<FragmentNavigatData> getData() {
        return data;
    }
}
