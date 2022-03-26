package com.vartsab.calc.controller;

import com.vartsab.calc.CalcService.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String sayHi(){
        return "Welcome to The Calculator";
    }

    @GetMapping("/plus")
    public String plus(
            String num1,
            String num2
    ){
        return calcService.getPlu(num1,num2);
    }

    @GetMapping("/minus")
    public String minus(
            String num1,
            String num2
    ){
        return calcService.getMin(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(
            String num1,
            String num2
    ){
        return calcService.getMul(num1,num2);
    }

    @GetMapping("/divide")
    public String divide(
            String num1,
            String num2
    ){
        return calcService.getDiv(num1,num2);
    }

}
