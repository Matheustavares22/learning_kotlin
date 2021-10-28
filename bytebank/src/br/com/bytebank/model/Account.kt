package br.com.bytebank.model

import br.com.bytebank.model.util.AccountUtil

class Account(
    val holder: String,
    val accountNumber: Int
) {
    var balance: Double = 0.0
    private var accountUtil = AccountUtil()
        private set

    init {
        println(
            "Holder: $holder\n" +
                    "Account number: $accountNumber"
        )
    }

    fun deposit(depositValue: Double) {
        when {
            accountUtil.valueIsValid(value = depositValue) -> this.balance += depositValue
        }
    }

    fun withdrawal(withdrawalValue: Double): Boolean {
        when {
            accountUtil.valueIsValid(value = withdrawalValue) &&
                    accountUtil.balanceIsSufficient(balance = this.balance, value = withdrawalValue) -> {
                this.balance -= withdrawalValue
                return true
            }
        }
        println("insufficient funds")
        return false
    }

    fun transfer(account: Account, transferredValue: Double): Boolean {
        when {
            withdrawal(withdrawalValue = transferredValue) -> {
                account.deposit(depositValue = transferredValue)
                return true
            }
        }
        return false
    }
}