package com.aprianfirlanda.datasource

import com.aprianfirlanda.model.Bank

interface BankDataSource {

    fun getBank(): Collection<Bank>
}