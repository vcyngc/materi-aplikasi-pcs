package com.pcs.apptoko.response.transaksi

class Data {
    data class Data(
        val transaksi: List<Transaksi>,
        val total:String
    )
}