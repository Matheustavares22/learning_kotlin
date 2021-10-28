package br.com.bytebank.model.util

class AccountUtil {
    fun valueIsValid(value: Double): Boolean {
        when {
            value > 0.0 -> return true
        }
        return false
    }

    fun balanceIsSufficient(balance: Double, value: Double): Boolean {
        when {
            value <= balance -> return true
        }
        return false
    }
}