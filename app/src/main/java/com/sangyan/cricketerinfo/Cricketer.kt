package com.sangyan.cricketerinfo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cricketer (
    val player_image : Int,
    val player_name : String?
    ) : Parcelable
