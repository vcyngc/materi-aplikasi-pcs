package com.pcs.apptoko.response.transaksi

class TransaksiResponse {
    data class TransaksiResponse(
        val `data`: Data,
        val message: String,
        val success: Boolean
    )
}