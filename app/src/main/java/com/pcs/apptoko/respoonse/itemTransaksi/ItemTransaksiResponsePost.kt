package com.pcs.apptoko.respoonse.itemTransaksi

class ItemTransaksiResponsePost {
    data class ItemTransaksiResponsePost(
        val `data`: Data,
        val message: String,
        val success: Boolean
    )
}