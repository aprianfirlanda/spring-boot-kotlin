package com.aprianfirlanda.service

import com.aprianfirlanda.datasource.BankDataSource
import com.aprianfirlanda.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = bankDataSource.retrieveBanks()
}