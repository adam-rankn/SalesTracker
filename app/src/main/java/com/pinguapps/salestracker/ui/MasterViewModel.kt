package com.pinguapps.salestracker.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pinguapps.salestracker.data.model.ModelClass

class MasterViewModel : ViewModel() {

    val currentModelObject: MutableLiveData<ModelClass> = MutableLiveData()


    fun selectCurrentModelObject(model: ModelClass){
        currentModelObject.postValue(model)
    }


}