package com.aprianfirlanda.datasource.mock

import com.aprianfirlanda.datasource.BankDataSource
import com.aprianfirlanda.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("123123", 0.0, 5),
        Bank("234234", 3.14, 0),
        Bank("345345", 12.8, 17),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull() { it.accountNumber == accountNumber }
        ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}