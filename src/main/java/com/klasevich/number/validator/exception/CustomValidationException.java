package com.klasevich.number.validator.exception;

import java.util.List;

public class CustomValidationException extends Exception{
    private final List<Integer> numbers;
    private final int number;

    public CustomValidationException(List<Integer>numbers,int number, String message) {
        super(message);
        this.numbers = numbers;
        this.number=number;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getNumber() {
        return number;
    }
}
