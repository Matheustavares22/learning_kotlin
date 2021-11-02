package br.com.bytebank.model.employees

import br.com.bytebank.model.Employee

class Director(
    private val password: String,
    var profitSharing: Double,
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name,
    cpf,
    salary
) {

    fun authenticates(password: String): Boolean {
        return when (this.password) {
            password -> {
                true
            }
            else -> false
        }
    }

    override val bonus: Double
        get() {
            println("bonus director")
            return super.bonus + salary + profitSharing
        }
}