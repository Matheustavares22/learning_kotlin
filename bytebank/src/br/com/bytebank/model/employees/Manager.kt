package br.com.bytebank.model.employees

import br.com.bytebank.model.Employee

class Manager(
    private val password: String,
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
            println("bonus manager")
            return super.bonus + salary
        }

}