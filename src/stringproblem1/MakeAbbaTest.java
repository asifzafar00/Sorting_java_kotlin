package stringproblem1;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

import java.io.UnsupportedEncodingException;

class MakeAbbaTest {

    MakeAbba mMakeAbba;

    @Before
    public void setUp() {
        mMakeAbba = new MakeAbba();
    }

    @Test
    public void makeAbba() {
        Assert.assertEquals("HiByeByeHi", mMakeAbba.makeAbba("Hi", "Bye"));
        Assert.assertEquals("YoAliceAliceYo", mMakeAbba.makeAbba("Yo", "Alice"));
        Assert.assertEquals("WhatUpUpWhat", mMakeAbba.makeAbba("What", "Up"));
    }

    @Test
    public void test() {
        MakeAbba aString = mock(MakeAbba.class);

        when(aString.makeAbba("Hi", "Bye")).thenReturn("HiByeByeHi");
        //  Assert.assertTrue(makeAbba("Hi", "Bye"),);

    }

}