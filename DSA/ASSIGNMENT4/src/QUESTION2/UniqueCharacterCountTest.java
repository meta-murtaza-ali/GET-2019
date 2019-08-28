package QUESTION2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterCountTest {
	UniqueCharacter charCount = new UniqueCharacter();

	@Test
	public void testUniqueCharacter() {
		assertEquals(6, charCount.UniqueChar("Metacube"));
		assertEquals(3, charCount.UniqueChar("hello"));
		assertEquals(1, charCount.UniqueChar("malyalam"));
		assertEquals(2, charCount.UniqueChar("Metacube is Metacube"));
	}

	@Test
	public void testUniqueCharacternNull() {
		assertEquals(0, charCount.UniqueChar(""));
		assertEquals(1, charCount.UniqueChar(" "));
	}

	@Test
	public void testUniqueChar() {
		assertEquals(0, charCount.UniqueChar("1111222"));
		assertEquals(3, charCount.UniqueChar("123"));

	}

}
