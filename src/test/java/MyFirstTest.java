import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    //Always going to be void, it is not returning anything
    public void testIfNumbersAreEqual(){
        int myNumber = 4;
        int userInput = 4;

        assertEquals(myNumber,userInput);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testTruth(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));


    }






}
