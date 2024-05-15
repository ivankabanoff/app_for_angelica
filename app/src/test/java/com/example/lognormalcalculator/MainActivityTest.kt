package com.example.lognormalcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.abs

class LognormalCalculatorTest {

    @Test
    fun `test generateRandomLognormalNumber with mean 1 and variance 0`() {
        val lognormalCalculator = LognormalCalculator()
        val mean = 1.0
        val variance = 0.0
        val randomNumber = lognormalCalculator.generateRandomLognormalNumber(mean, variance)
        assertEquals(Math.exp(mean), randomNumber, 0.0001)
    }

    @Test
    fun `test generateRandomLognormalNumber with mean 2 and variance 3`() {
        val lognormalCalculator = LognormalCalculator()
        val mean = 2.0
        val variance = 3.0
        val randomNumber = lognormalCalculator.generateRandomLognormalNumber(mean, variance)

        assert(randomNumber >= 0)
    }

    @Test
    fun `test generateRandomLognormalNumber with negative mean and variance`() {
        val lognormalCalculator = LognormalCalculator()
        val mean = -1.0
        val variance = -2.0
        val randomNumber = lognormalCalculator.generateRandomLognormalNumber(mean, variance)
        assert(randomNumber >= 0)
    }
    @Test
    fun testGenerateRandomLognormalNumber_zeroVariance() {
        val lognormalCalculator = LognormalCalculator()
        val mean = 3.0
        val variance = 0.0

        val randomNumber = lognormalCalculator.generateRandomLognormalNumber(mean, variance)


        val expectedValue = Math.exp(mean)
        val tolerance = 0.001
        assert(abs(randomNumber - expectedValue) < tolerance)
    }


}
