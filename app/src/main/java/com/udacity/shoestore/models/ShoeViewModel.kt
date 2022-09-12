package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel: ViewModel() {

    private var _shoelist:MutableLiveData<List<Shoe>> = MutableLiveData(listOf())
    var shoelist:LiveData<List<Shoe>> = _shoelist

    fun addShoe(it:Shoe) {
        _shoelist.value = _shoelist.value?.plus(it)?: listOf(it)
    }

}