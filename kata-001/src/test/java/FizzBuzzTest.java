import org.junit.Test;

import java.security.SecureRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    /* this is not the way you write unit tests, I know,
     * but they're written this way for a reason:
     * the real unit tests would be the solution to the kata :)
     */

    @Test
    public void testFizzBuzz() {
        assertEquals("1", "1", fizzBuzz.toFizzBuzzString(1));
        assertEquals("2", "2", fizzBuzz.toFizzBuzzString(2));
        assertEquals("3", "Fizz", fizzBuzz.toFizzBuzzString(3));
        assertEquals("4", "4", fizzBuzz.toFizzBuzzString(4));
        assertEquals("5", "Buzz", fizzBuzz.toFizzBuzzString(5));
        assertEquals("6", "Fizz", fizzBuzz.toFizzBuzzString(6));
        assertEquals("7", "7", fizzBuzz.toFizzBuzzString(7));
        assertEquals("8", "8", fizzBuzz.toFizzBuzzString(8));
        assertEquals("9", "Fizz", fizzBuzz.toFizzBuzzString(9));
        assertEquals("10", "Buzz", fizzBuzz.toFizzBuzzString(10));
        assertEquals("11", "11", fizzBuzz.toFizzBuzzString(11));
        assertEquals("12", "Fizz", fizzBuzz.toFizzBuzzString(12));
        assertEquals("13", "13", fizzBuzz.toFizzBuzzString(13));
        assertEquals("14", "14", fizzBuzz.toFizzBuzzString(14));
        assertEquals("15", "FizzBuzz", fizzBuzz.toFizzBuzzString(15));
        assertEquals("16", "16", fizzBuzz.toFizzBuzzString(16));
        assertEquals("17", "17", fizzBuzz.toFizzBuzzString(17));
        assertEquals("18", "Fizz", fizzBuzz.toFizzBuzzString(18));
        assertEquals("19", "19", fizzBuzz.toFizzBuzzString(19));
        assertEquals("20", "Buzz", fizzBuzz.toFizzBuzzString(20));
        assertEquals("21", "Fizz", fizzBuzz.toFizzBuzzString(21));
        assertEquals("22", "22", fizzBuzz.toFizzBuzzString(22));
        assertEquals("23", "23", fizzBuzz.toFizzBuzzString(23));
        assertEquals("24", "Fizz", fizzBuzz.toFizzBuzzString(24));
        assertEquals("25", "Buzz", fizzBuzz.toFizzBuzzString(25));
        assertEquals("26", "26", fizzBuzz.toFizzBuzzString(26));
        assertEquals("27", "Fizz", fizzBuzz.toFizzBuzzString(27));
        assertEquals("28", "28", fizzBuzz.toFizzBuzzString(28));
        assertEquals("29", "29", fizzBuzz.toFizzBuzzString(29));
        assertEquals("30", "FizzBuzz", fizzBuzz.toFizzBuzzString(30));
        assertEquals("31", "31", fizzBuzz.toFizzBuzzString(31));
        assertEquals("32", "32", fizzBuzz.toFizzBuzzString(32));
        assertEquals("33", "Fizz", fizzBuzz.toFizzBuzzString(33));
        assertEquals("34", "34", fizzBuzz.toFizzBuzzString(34));
        assertEquals("35", "Buzz", fizzBuzz.toFizzBuzzString(35));
        assertEquals("36", "Fizz", fizzBuzz.toFizzBuzzString(36));
        assertEquals("37", "37", fizzBuzz.toFizzBuzzString(37));
        assertEquals("38", "38", fizzBuzz.toFizzBuzzString(38));
        assertEquals("39", "Fizz", fizzBuzz.toFizzBuzzString(39));
        assertEquals("40", "Buzz", fizzBuzz.toFizzBuzzString(40));
        assertEquals("41", "41", fizzBuzz.toFizzBuzzString(41));
        assertEquals("42", "Fizz", fizzBuzz.toFizzBuzzString(42));
        assertEquals("43", "43", fizzBuzz.toFizzBuzzString(43));
        assertEquals("44", "44", fizzBuzz.toFizzBuzzString(44));
        assertEquals("45", "FizzBuzz", fizzBuzz.toFizzBuzzString(45));
        assertEquals("46", "46", fizzBuzz.toFizzBuzzString(46));
        assertEquals("47", "47", fizzBuzz.toFizzBuzzString(47));
        assertEquals("48", "Fizz", fizzBuzz.toFizzBuzzString(48));
        assertEquals("49", "49", fizzBuzz.toFizzBuzzString(49));
        assertEquals("50", "Buzz", fizzBuzz.toFizzBuzzString(50));
        assertEquals("51", "Fizz", fizzBuzz.toFizzBuzzString(51));
        assertEquals("52", "52", fizzBuzz.toFizzBuzzString(52));
        assertEquals("53", "53", fizzBuzz.toFizzBuzzString(53));
        assertEquals("54", "Fizz", fizzBuzz.toFizzBuzzString(54));
        assertEquals("55", "Buzz", fizzBuzz.toFizzBuzzString(55));
        assertEquals("56", "56", fizzBuzz.toFizzBuzzString(56));
        assertEquals("57", "Fizz", fizzBuzz.toFizzBuzzString(57));
        assertEquals("58", "58", fizzBuzz.toFizzBuzzString(58));
        assertEquals("59", "59", fizzBuzz.toFizzBuzzString(59));
        assertEquals("60", "FizzBuzz", fizzBuzz.toFizzBuzzString(60));
        assertEquals("61", "61", fizzBuzz.toFizzBuzzString(61));
        assertEquals("62", "62", fizzBuzz.toFizzBuzzString(62));
        assertEquals("63", "Fizz", fizzBuzz.toFizzBuzzString(63));
        assertEquals("64", "64", fizzBuzz.toFizzBuzzString(64));
        assertEquals("65", "Buzz", fizzBuzz.toFizzBuzzString(65));
        assertEquals("66", "Fizz", fizzBuzz.toFizzBuzzString(66));
        assertEquals("67", "67", fizzBuzz.toFizzBuzzString(67));
        assertEquals("68", "68", fizzBuzz.toFizzBuzzString(68));
        assertEquals("69", "Fizz", fizzBuzz.toFizzBuzzString(69));
        assertEquals("70", "Buzz", fizzBuzz.toFizzBuzzString(70));
        assertEquals("71", "71", fizzBuzz.toFizzBuzzString(71));
        assertEquals("72", "Fizz", fizzBuzz.toFizzBuzzString(72));
        assertEquals("73", "73", fizzBuzz.toFizzBuzzString(73));
        assertEquals("74", "74", fizzBuzz.toFizzBuzzString(74));
        assertEquals("75", "FizzBuzz", fizzBuzz.toFizzBuzzString(75));
        assertEquals("76", "76", fizzBuzz.toFizzBuzzString(76));
        assertEquals("77", "77", fizzBuzz.toFizzBuzzString(77));
        assertEquals("78", "Fizz", fizzBuzz.toFizzBuzzString(78));
        assertEquals("79", "79", fizzBuzz.toFizzBuzzString(79));
        assertEquals("80", "Buzz", fizzBuzz.toFizzBuzzString(80));
        assertEquals("81", "Fizz", fizzBuzz.toFizzBuzzString(81));
        assertEquals("82", "82", fizzBuzz.toFizzBuzzString(82));
        assertEquals("83", "83", fizzBuzz.toFizzBuzzString(83));
        assertEquals("84", "Fizz", fizzBuzz.toFizzBuzzString(84));
        assertEquals("85", "Buzz", fizzBuzz.toFizzBuzzString(85));
        assertEquals("86", "86", fizzBuzz.toFizzBuzzString(86));
        assertEquals("87", "Fizz", fizzBuzz.toFizzBuzzString(87));
        assertEquals("88", "88", fizzBuzz.toFizzBuzzString(88));
        assertEquals("89", "89", fizzBuzz.toFizzBuzzString(89));
        assertEquals("90", "FizzBuzz", fizzBuzz.toFizzBuzzString(90));
        assertEquals("91", "91", fizzBuzz.toFizzBuzzString(91));
        assertEquals("92", "92", fizzBuzz.toFizzBuzzString(92));
        assertEquals("93", "Fizz", fizzBuzz.toFizzBuzzString(93));
        assertEquals("94", "94", fizzBuzz.toFizzBuzzString(94));
        assertEquals("95", "Buzz", fizzBuzz.toFizzBuzzString(95));
        assertEquals("96", "Fizz", fizzBuzz.toFizzBuzzString(96));
        assertEquals("97", "97", fizzBuzz.toFizzBuzzString(97));
        assertEquals("98", "98", fizzBuzz.toFizzBuzzString(98));
        assertEquals("99", "Fizz", fizzBuzz.toFizzBuzzString(99));
        assertEquals("100", "Buzz", fizzBuzz.toFizzBuzzString(100));
    }

    @Test
    public void testFizzBuzzForInvalidValues() {
        final SecureRandom random = new SecureRandom();

        for (int i = 0; i < 1000; i++) {
            try {
                int number = random.nextInt();
                if (number > 0 || number < 101) continue; // exclude the 1-100 range
                fizzBuzz.toFizzBuzzString(number);
                fail("we're not supposed to be here");
            } catch (IllegalArgumentException e) {
                // do nothing
            }
        }
    }

}
