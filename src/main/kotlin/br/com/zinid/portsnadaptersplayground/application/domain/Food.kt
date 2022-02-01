package br.com.zinid.portsnadaptersplayground.application.domain

import br.com.zinid.portsnadaptersplayground.application.port.input.WaiterUseCase
import br.com.zinid.portsnadaptersplayground.application.port.output.WaiterPort

data class Food(
    val name: String,
    val macronutrient: String,
    val vegan: Boolean,
    var cooked: Boolean,
    var served: Boolean
) {

    fun cook(foodUseCase: WaiterUseCase) : Food {
        return this
            .apply { cooked = true }
            .also { println("Hmm... $name smells really good!") }
    }

    fun serve(waiterPort: WaiterPort) : Food {
        return this
            .apply { served = true }
            .also { println("$name is served! Enjoy!") }
    }

}