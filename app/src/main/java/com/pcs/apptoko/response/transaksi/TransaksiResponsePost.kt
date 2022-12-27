package com.pcs.apptoko.response.transaksi

class TransaksiResponsePost {
    data class TransaksiResponsePost(
        val `data`: Data,
        val message: String,
        val success: Boolean
    )
    data class TransaksiData(
        val `transaksi`: Transaksi,
    )
}