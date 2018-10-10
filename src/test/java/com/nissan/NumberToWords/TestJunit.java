package com.nissan.NumberToWords;
import static org.junit.Assert.assertEquals;

import org.junit.*;




public class TestJunit {
	 
	@Test
	public void testMessage() {
		assertEquals("Ten",NumberToWords.findWord(10));
		
	}
	@Test
	public void testMessagen() {
		assertEquals("One",NumberToWords.findWord(1));
		
	}

}
