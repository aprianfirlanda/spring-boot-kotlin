package com.aprianfirlanda.datasource.mock

import com.aprianfirlanda.datasource.BankDataSource
import com.aprianfirlanda.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("123132", 0.0, 5),
        Bank("234234", 3.14, 0),
        Bank("345345", 12.8, 17),
    )

    override fun getBank(): Collection<Bank> {
        return banks
    }
}