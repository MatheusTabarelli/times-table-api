package com.example.calculator.controller;

import static com.example.calculator.model.ResultBuilder.getResult;
import static com.example.calculator.model.ResultBuilder.getResultFromError;


import com.example.calculator.method.TimesTableCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.ApiResult;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    public TimesTableCalculator ttc = new TimesTableCalculator();



    @GetMapping("/times-table")
    public ApiResult Table (@RequestParam int multiplier) {

        if ((multiplier < 1) || (multiplier > 1000)) {
            return getResultFromError("The number must be greater than ZERO and lesser than 1000");
        }
        return getResult(ttc.timesTable(multiplier));
            }

}

