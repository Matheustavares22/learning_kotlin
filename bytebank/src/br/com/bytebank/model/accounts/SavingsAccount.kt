package br.com.bytebank.model.accounts

import br.com.bytebank.model.Account

class SavingsAccount(
    holder: String,
    accountNumber: Int
) : Account(
    holder,
    accountNumber
) {
}