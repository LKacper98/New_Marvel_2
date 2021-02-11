package com.example.marvelapp.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Characters(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
): Parcelable