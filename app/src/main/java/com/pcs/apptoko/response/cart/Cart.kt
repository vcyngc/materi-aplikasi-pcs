package com.pcs.apptoko.response.cart

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

class Cart {
    @Parcelize
    data class Cart (
    var id: Int,
    var harga: Int,
    var qty: Int
            ):Parcelable
}