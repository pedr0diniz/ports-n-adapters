package br.com.zinid.portsnadaptersplayground.application.port.output

import br.com.zinid.portsnadaptersplayground.application.domain.Food

interface WaiterPort {

    fun serveMeal(meal: Food) : Food

}