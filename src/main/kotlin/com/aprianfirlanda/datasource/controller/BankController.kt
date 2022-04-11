package com.aprianfirlanda.datasource.controller

import com.aprianfirlanda.model.Bank
import com.aprianfirlanda.service.BankService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/bank")
class BankController(private val bankService: BankService) {

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(error: NoSuchElementException): ResponseEntity<String> =
        ResponseEntity(error.message, HttpStatus.NOT_FOUND)

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleBadRequest(error: IllegalArgumentException): ResponseEntity<String> =
        ResponseEntity(error.message, HttpStatus.BAD_REQUEST)

    @GetMapping
    fun getBanks(): Collection<Bank> = bankService.getBanks()

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank = bankService.getBank(accountNumber)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addBank(@RequestBody bank: Bank): Bank = bankService.addBank(bank)
}