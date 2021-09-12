package com.klasevich.number.validator.main;

import com.klasevich.number.validator.exception.CustomValidationException;
import com.klasevich.number.validator.service.NumberService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        outputCorrectNumbers();
    }

    private static void outputCorrectNumbers() {
        NumberService numberService = new NumberService();

        List<Integer> numbers = numberService.generateNumbers();

        try {
            numberService.validateNumber(numbers);
            numbers.forEach(System.out::println);
        } catch (CustomValidationException e) {
            logger.error("list has {}, problem with number {} {}", e.getNumbers(), e.getNumber(), e);
            outputCorrectNumbers();
        }
    }
}
