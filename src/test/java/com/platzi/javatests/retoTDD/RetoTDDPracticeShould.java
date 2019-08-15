package com.platzi.javatests.retoTDD;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import static org.junit.Assert.*;

public class RetoTDDPracticeShould {
    @Test
    public void return_fizz_when_is_divisible_by_3() {
        RetoTDDPractice reto = new RetoTDDPractice();
        String divisibleStr = reto.messageByDivisible(3);
        assertThat(divisibleStr, is("Fizz"));
    }

    @Test
    public void return_Buzz_when_is_divisible_by_5() {
        RetoTDDPractice reto = new RetoTDDPractice();
        String divisibleStr = reto.messageByDivisible(10);
        assertThat(divisibleStr, is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_when_is_divisible_by_3_5() {
        RetoTDDPractice reto = new RetoTDDPractice();
        String divisibleStr = reto.messageByDivisible(15);
        assertThat(divisibleStr, is("FizzBuzz"));
    }

    @Test
    public void return_same_number_when_not_divisible_nothing() {
        RetoTDDPractice reto = new RetoTDDPractice();
        String divisibleStr = reto.messageByDivisible(22);
        assertThat(divisibleStr, is(String.valueOf(22)));
    }
}