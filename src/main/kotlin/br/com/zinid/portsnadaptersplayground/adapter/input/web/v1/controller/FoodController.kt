package br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.controller

import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.api.request.FoodRequest
import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.api.response.FoodResponse
import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.converter.toDomain
import br.com.zinid.portsnadaptersplayground.adapter.input.web.v1.converter.toResponse
import br.com.zinid.portsnadaptersplayground.application.port.input.WaiterUseCase
import br.com.zinid.portsnadaptersplayground.application.port.output.WaiterPort
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FoodController(
    private val waiterUseCase: WaiterUseCase,
    private val waiterPort: WaiterPort
) {

    @PostMapping
    fun order(@RequestBody customerOrder: FoodRequest) : FoodResponse {
        val cookedMeal = waiterUseCase.takeOrder(customerOrder.toDomain())
        val servedMeal = waiterPort.serveMeal(cookedMeal)

        return servedMeal.toResponse()
    }

}