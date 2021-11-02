package br.com.bytebank.model.accounts

import br.com.bytebank.model.Account

class CurrentAccount(
    holder: String,
    accountNumber: Int
) : Account(
    holder,
    accountNumber
) {
    override fun withdrawal(withdrawalValue: Double): Boolean {
        val valueWithTax = withdrawalValue + 0.1
        return (super.withdrawal(valueWithTax))
    }
}