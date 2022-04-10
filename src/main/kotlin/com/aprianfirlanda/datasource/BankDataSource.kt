package com.aprianfirlanda.datasource

import com.aprianfirlanda.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}