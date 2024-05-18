package com.example.myapplication.UI.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.DATA.DataSources.Repositoriy;
import com.example.myapplication.DATA.Model.DataList;
import com.example.myapplication.R;

public class ItemDataViewModel extends ViewModel {
    private Repositoriy repository = new Repositoriy();
    public LiveData<DataList> getItem(String itemId) {
        return new MutableLiveData<>(new DataList(itemId, R.drawable.vladeleccat));
    }
}
