package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		String s="Hello World";
		String s1="Hello World";
		assertTrue(s==s1);
		String s2="Hello"+" "+"World";
		assertTrue(s==s2);
		String s3="World";
		String s4="Hello l"+s3;
		assertTrue(s.equals(s4));
		assertFalse(s==s4);
	}

}
