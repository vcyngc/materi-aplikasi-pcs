package com.pcs.apptoko.response.itemTransaksi

class ItemTransaksiResponsePost {
    data class ItemTransaksiResponsePost(
        val `data`: Data,
        val message: String,
        val success: Boolean
    )
}