package br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.converter

import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.api.request.FoodRequest
import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.api.response.FoodResponse
import br.com.zinid.portsnadaptersplayground.application.domain.Food

fun FoodRequest.toDomain() : Food {
    return Food(
        name = name,
        macronutrient = macronutrient,
        vegan = vegan,
        cooked = false,
        served = false
    )
}

fun Food.toResponse() : FoodResponse {
    return FoodResponse(
        name = name,
        macronutrient = macronutrient
    )
}