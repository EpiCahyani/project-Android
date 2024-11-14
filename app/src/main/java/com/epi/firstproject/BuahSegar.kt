package com.epi.firstproject

import androidx.annotation.AnyRes

data class BuahSegar(
    var buahName: String,
    var imageRes: Int,
)

fun getAllBuahSegar() : List<BuahSegar> {
    return listOf(
        BuahSegar("Jeruk",R.drawable.jerukperas),
        BuahSegar("Pisang",R.drawable.pisang),
        BuahSegar("Melon",R.drawable.melon),
        BuahSegar("Anggur",R.drawable.anggurmerah),
        BuahSegar("Mangga",R.drawable.mangga),
        BuahSegar("Naga",R.drawable.buahnaga),
        BuahSegar("Manggis",R.drawable.manggis),
        BuahSegar("Alpukat",R.drawable.buahijolupa),
        BuahSegar("Pepaya",R.drawable.papaya),
        BuahSegar("Sawo",R.drawable.sawo),
        BuahSegar("Apel",R.drawable.apelmanis),
        BuahSegar("Pear",R.drawable.pear),
    )
}
