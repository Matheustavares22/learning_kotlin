package br.com.bytebank.model.employees

import br.com.bytebank.model.Employee

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name,
    cpf,
    salary
) {


    override val bonus: Double
        get() {
            println("bonus Analyst")
            return super.bonus + salary * 0.1
        }
}