import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void isAnagramTest() {

		assertTrue(Anagram.isAnagram("dynamite", "may it end"));
		assertFalse(Anagram.isAnagram("Racecar", "asodjf"));

	}
}
