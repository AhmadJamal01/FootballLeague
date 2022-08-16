package com.bignerdranch.android.footballleague.network

data class League(
    val data: List<Data>,
    val status: Boolean
) {
    data class Data(
        val abbr: String,//
        val id: String,
        val logos: Logos,//
        val name: String, //
        val slug: String
    ) {
        data class Logos(
            val dark: String,
            val light: String
        )
    }
}

//data class League(val id: Long, val abbr: String, val logos: Logos, val name:String)
//
//data class Logos(
//    val dark: String,
//    val light: String
//)

//data class League (val id : String , val name: String , val slug : String, val abbr : String , val logos: Logos)
//data class ApiModel(val status : Boolean , val data : List<League>)
//data class Logos(val dark : String , val light : String )