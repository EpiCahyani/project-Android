package com.epi.firstproject

import android.widget.Button
import androidx.annotation.AnyRes

data class BuahSayur(
    var sayurName: String,
    var name: String,
    var imageRes: Int,
)

fun getAllBuahSayur() : List<BuahSayur>{
    return listOf(

        BuahSayur("Kangkung","Sayur segar baru dipetik",R.drawable.kangkung),
        BuahSayur("sawi putih", "sawi putih segar",R.drawable.sawiputih),
        BuahSayur("Daun bawang", "segar dari petani",R.drawable.daunbawang),
        BuahSayur("Tomat besar", "segar dari petani",R.drawable.tomat),
        BuahSayur("daun seledri", "segar dari petani",R.drawable.seledri),
        BuahSayur("buncis", "buncis dari petani",R.drawable.buncis),
        BuahSayur("bayam hijau", "bayam segar",R.drawable.bayam),
        BuahSayur("pokcoy", "pokcoy sekeluarga dengan bukcoy",R.drawable.pokcoy),
        BuahSayur("sawi caisim", "sawi pahit dikit",R.drawable.sawii),
        BuahSayur("Kacang Panjang", "segar dari petani",R.drawable.kacangpanjang),
        BuahSayur("Wortel", "segar dari petani",R.drawable.wortel),
        BuahSayur("Terong Lalap", "segar dari petani",R.drawable.terong_lalap_ijo),
        BuahSayur("Paprika rembow", "segar dari petani",R.drawable.paprika),

    )
}