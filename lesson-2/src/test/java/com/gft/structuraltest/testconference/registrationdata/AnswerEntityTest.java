package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.*;

@RunWith(JUnitParamsRunner.class)
public class AnswerEntityTest{

	//2
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
	
	//4
	@Test
    public void shouldReturnFalseWhenObjectIsNull2(){
        AnswerEntity an1 = new AnswerEntity();
        String an2 = new String();
        assertFalse(an1.equals(an2));
    }
	
	//3
	@Test
	public void shouldReturnTrueWhenObjectIsobject(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
        assertTrue(an1.equals(an2));
    }
	
	//1
	@Test
	public void shouldReturnTrueWhenThisIsObject(){
        Object an2 = new AnswerEntity();
        assertTrue(an2.equals(an2));
    }
	//----------------------AnswerEntity
	
	//5
	@Test
	public void shouldReturnFalseWhenAnswerNullAndOtherAnswerNotNull(){
        AnswerEntity an1 = new AnswerEntity();
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText("jacek@wp.pl");
        assertFalse(an1.equals(an2));
    }
	
	//6
	@Test
	@Parameters({
            "jacek,jacek,true",
            "jacek,kecaj,false"
			
			
    })
    public void AnswerTextTest(String ani1Text, String ani2Text, boolean result){
        AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText(ani1Text);
        AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText(ani2Text);
		
        assertEquals(an1.equals(an2), result);
    }
	
	//----------------------Id
	
	//7
	@Test
	public void shouldReturnFalseWhenIdNullAndOtherIdNotNull(){
        AnswerEntity an1 = new AnswerEntity();
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setId(Long.parseLong("1"));
        assertFalse(an1.equals(an2));
    }
	
	//8
	@Test
	@Parameters({
            "1,1,true",
            "1,2,false"
			
			
    })
    public void AnswerIdtTest(String ani1Id, String ani2Id, boolean result){
        AnswerEntity an1 = new AnswerEntity();
		an1.setId(Long.parseLong(ani1Id));
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setId(Long.parseLong(ani2Id));
		
        assertEquals(an1.equals(an2), result);
    }
	
    //----------------------QuestionEntity
	
	//9
	@Test
	public void shouldReturnFalseWhenQuestionNullAndOtherQuestionNotNull(){
        AnswerEntity an1 = new AnswerEntity();
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(new QuestionEntity() );
        assertFalse(an1.equals(an2));
    }
	
	//11
	@Test
	
    public void AnswerQuestiontTest1SameQuestion(){
		QuestionEntity q1 = new QuestionEntity();
		q1.setId(Long.parseLong("1"));
		
        AnswerEntity an1 = new AnswerEntity();
		an1.setQuestion(q1);
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(q1);
		
        assertTrue(an1.equals(an2));
    }
	
	//12
	@Test
	
    public void AnswerQuestiontTest2DifferentQuestion(){
		QuestionEntity q1 = new QuestionEntity();
		q1.setId(Long.parseLong("1"));
		
        AnswerEntity an1 = new AnswerEntity();
		an1.setQuestion(q1);
		
		QuestionEntity q2 = new QuestionEntity();
		q2.setId(Long.parseLong("2"));
		
        AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(q2);
		
        assertFalse(an1.equals(an2));
    }
}