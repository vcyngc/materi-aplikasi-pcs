package com.pcs.apptoko.response.produk

class ProdukResponse {
    data class ProdukResponse(
        val `data`: Data,
        val message: String,
        val succes: Boolean
    )
}