package br.com.zinid.portsnadaptersplayground.application.port.input

import br.com.zinid.portsnadaptersplayground.application.domain.Food

interface WaiterUseCase {

    fun takeOrder(order: Food) : Food

}