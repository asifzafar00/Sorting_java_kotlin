package stringproblem1.kotlin

fun main() {
    println(makeAbba("Hi", "Bye"))
}

/*

    Given two strings, a and b, return the result of putting
    them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"


    */

fun makeAbba(a: String, b: String): String {
    return a.plus(b).plus(b).plus(a)
}