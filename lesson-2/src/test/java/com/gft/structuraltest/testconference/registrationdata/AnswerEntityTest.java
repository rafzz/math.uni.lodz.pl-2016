package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;
import junitparams.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AnswerEntityTest{
	
	
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
	
	
	@Test
    public void shouldReturnTrueWhenObjectIsObject(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
        assertTrue(an1.equals(an2));
    }
	
	
	@Test
	@Parameters({
            "jacek@wp.pl,jacek@wp.pl,true",
            "jacek,kecaj,false"
    })
    public void shouldReturnFalseWhenAnswerTextIsDifferent(String ani1Text, String ani2Text, boolean result){
        AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText(ani1Text);
        AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText(ani2Text);
        assertEquals(an1.equals(an2), result);
    }
	
	/*
	@Test
	public void shouldReturnFalseWhenAnswerTextIsDifferent(){
        AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText("jacek@wp.pl,jacek@wp.pl");
        AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText("jacek@wp.pl,jacek@wp.pl");
        assertEquals(an1.equals(an2), true);
	}
	
	*/
	
	
	
    
}