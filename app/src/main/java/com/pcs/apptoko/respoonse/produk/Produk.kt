package com.pcs.apptoko.respoonse.produk

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

class Produk {
    @Parcelize
    data class Produk(
        val  admin_id:String,
        val harga: String,
        val id: String,
        val nama: String,
        val nama_admin: String,
        val token: String
    ):Parcelable
}