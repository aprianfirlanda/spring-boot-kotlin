package com.aprianfirlanda.service

import com.aprianfirlanda.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val bankDataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(bankDataSource)
    
    @Test
    fun `should call it datasource to retrieve banks`() {
        // when
        bankService.getBanks()
        
        // then
        verify(exactly = 1) { bankDataSource.retrieveBanks() }
          
    }
}