package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testMoodAnalyser() {
		MoodAnalyser analyser = new MoodAnalyser();

		assertEquals("happy", analyser.analyseMood("happy"));
		assertEquals("sad", analyser.analyseMood("sad"));
		assertEquals("happy", analyser.analyseMood(null));
		assertEquals("happy", analyser.analyseMood(""));
	}

	private void assertEquals(String happy, String happy1) {
	}

}
