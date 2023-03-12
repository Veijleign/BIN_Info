package com.example.temporaryapp.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModel
import android.net.Uri;
import android.util.Log
import androidx.core.content.ContextCompat.startActivity

class MainViewModel : ViewModel() {

    var bin: String = ""
    var bankURL: String = ""
    var bankPhoneNumber: String = ""
    var bankCoordinates: String = ""

    fun inputBIN(binNumber: String)
    {
        bin = binNumber
        Log.d("!", bin)
    }

    fun goToBankURL(address: String)
    {
        bankURL = address
        Log.d("!", bankURL)

        //var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("bankURL"))
        //APP_ACTIVITY.startActivity(intent)
    }

    fun goToBankPhoneNumber(phone: String)
    {
        bankPhoneNumber = "tel:" + phone
        Log.d("!", bankPhoneNumber)

        //var intent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("bankPhoneNumber"))
        //startActivity(intent)
    }

    fun goToBankCoordinates(coordinates: String)
    {
        bankCoordinates = "geo:" + coordinates
        Log.d("!", bankCoordinates)

        //var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("bankCoordinates"))
        //startActivity(intent)
    }

}