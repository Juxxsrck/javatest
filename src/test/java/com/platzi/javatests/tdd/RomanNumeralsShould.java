package com.platzi.javatests.tdd;

import org.junit.Test;

import static com.platzi.javatests.tdd.RomanNumerals.arabicToRoman;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RomanNumeralsShould {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void roman_number() {
        assertThat(arabicToRoman(49), is("XLIX"));
    }
}