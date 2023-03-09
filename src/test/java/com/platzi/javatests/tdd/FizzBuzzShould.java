package com.platzi.javatests.tdd;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzShould {

    @Test
    public void case_return_fizz() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void case_return_buzz() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void case_return_fizz_buzz() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void case_return_number() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
}