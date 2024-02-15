package com.eazybytes.loans.controller;

import com.eazybytes.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoansController {

    private ILoansService iLoansService;
}
