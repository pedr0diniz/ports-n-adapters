package br.com.zinid.portsnadaptersplayground.application.service

import br.com.zinid.portsnadaptersplayground.application.domain.Food
import br.com.zinid.portsnadaptersplayground.application.port.input.WaiterUseCase
import org.springframework.stereotype.Service

@Service
class KitchenService : WaiterUseCase {

    override fun takeOrder(order: Food): Food {
        order.cook(this)
        return order
    }

}