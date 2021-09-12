package com.klasevich.number.validator.service;

import com.klasevich.number.validator.exception.CustomValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberService {
    public List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        random.ints(3, 1, 9).forEach(numbers::add);


        return numbers;
    }

    public void validateNumber(List<Integer> numbers) throws CustomValidationException {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2==0){
                throw new CustomValidationException(numbers,numbers.get(i),"isn't odd");
            }
        }
    }
}
