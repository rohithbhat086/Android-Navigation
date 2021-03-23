package com.rgb.example.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel() : ViewModel() {
    private val person = MutableLiveData<Person>()

    val personData : LiveData<Person>
    get() = person

    fun updateName(name : String){
        person.value?.name = name
    }

    fun updateEmail(mail : String){
        person.value?.email = mail
    }
}