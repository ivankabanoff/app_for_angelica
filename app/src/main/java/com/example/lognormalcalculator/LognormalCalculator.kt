package com.example.lognormalcalculator

class LognormalCalculator {

    internal fun generateRandomLognormalNumber(mean: Double, variance: Double): Double {
        val randomNormalNumber = Math.random().let { it * 2.0 - 1.0 }
        return Math.exp(mean + randomNormalNumber * variance / Math.sqrt(2.0))
    }
}
