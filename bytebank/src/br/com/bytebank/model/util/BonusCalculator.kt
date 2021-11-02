package br.com.bytebank.model.util

import br.com.bytebank.model.Employee

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus
    }
}