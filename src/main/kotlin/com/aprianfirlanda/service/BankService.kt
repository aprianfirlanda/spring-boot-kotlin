package com.aprianfirlanda.service

import com.aprianfirlanda.datasource.BankDataSource
import com.aprianfirlanda.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = bankDataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = bankDataSource.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = bankDataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank = bankDataSource.updateBank(bank)

    fun deleteBank(accountNumber: String) {
        bankDataSource.deleteBank(accountNumber)
    }
}