package com.vartsab.calc.CalcService;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String getPlu(String num1, String num2) {

        if (num1 == null || num2 == null)
            return "<strong>ERROR!</strong> Please enter two parameters.";

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        return a + " + " + b + " = " + (a + b);

    }

    @Override
    public String getMin(String num1, String num2) {

        if (num1 == null || num2 == null)
            return "<strong>ERROR!</strong> Please enter two parameters.";

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        return a + " - " + b + " = " + (a - b);

    }

    @Override
    public String getMul(String num1, String num2) {

        if (num1 == null || num2 == null)
            return "<strong>ERROR!</strong> Please enter two parameters.";

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        return a + " * " + b + " = " + (a * b);

    }

    @Override
    public String getDiv(String num1, String num2) {

        if (num1 == null || num2 == null)
            return "<strong>ERROR!</strong> Please enter two parameters.";

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        if ( b == 0 )
            return "<strong>ERROR!</strong> You cannot divide" + a + " by 0";

        return a + "/" + b + " = " + (a / b);
    }
}
