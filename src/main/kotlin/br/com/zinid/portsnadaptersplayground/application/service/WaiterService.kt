package br.com.zinid.portsnadaptersplayground.application.service

import br.com.zinid.portsnadaptersplayground.application.domain.Food
import br.com.zinid.portsnadaptersplayground.application.port.output.WaiterPort
import org.springframework.stereotype.Service

@Service
class WaiterService() : WaiterPort {

    override fun serveMeal(meal: Food): Food {
        meal.serve(this)
        return meal
    }
}