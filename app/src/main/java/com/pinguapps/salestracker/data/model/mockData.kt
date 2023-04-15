package com.pinguapps.salestracker.data.model

fun getMockData(): MutableList<ModelClass> {

    val mutableList = mutableListOf<ModelClass>()

    val saganaki = ModelClass(
        "Saganaki",
        "$12",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(saganaki)

    val  chickenSouv = ModelClass(
        "Chicken Souvlaki",
        "$10",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(chickenSouv)

    val  porkSouv = ModelClass(
        "Pork Souvlaki",
        "$10",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(porkSouv)

    val pita = ModelClass(
        "Pitas",
        "$8",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(pita)

    val pitasWhole = ModelClass(
        "Pitas",
        "$8",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(pitasWhole)

    val tzatziki = ModelClass(
        "Tzatziki",
        "$9",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(tzatziki)

    val dolmades = ModelClass(
        "Dolmades",
        "$11",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(dolmades)

    val olives = ModelClass(
        "Olives",
        "$6",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(olives)

    val baklava = ModelClass(
        "Baklava",
        "$9",
        "detail",
        "detailB",
        "detailC",
    )
    mutableList.add(baklava)
    return mutableList
}