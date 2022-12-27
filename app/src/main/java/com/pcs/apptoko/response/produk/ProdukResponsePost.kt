package com.pcs.apptoko.response.produk

class ProdukResponsePost {
    data class ProdukResponsePost(
        val `data`: Data,
        val message: String,
        val success: Boolean
    )
    data class DataProduk(
        val `produk`: Produk
    )
}