package com.example.recyclerview_muamarzidan_21_xirpl5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BahasaWeb(
    val imgbahasaweb: Int,
    val namebahasaweb: String,
    val descbahasaweb: String
) : Parcelable
