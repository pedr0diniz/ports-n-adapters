package br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.api.request

data class FoodRequest(
    val name: String,
    val macronutrient: String,
    val vegan: Boolean
)