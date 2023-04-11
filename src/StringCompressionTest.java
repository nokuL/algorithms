import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class StringCompressionTest {
    StringCompression stringCompression;

    @BeforeEach
    public  void setUp(){
        stringCompression = new StringCompression();
    }

    @Test
    @DisplayName("Test compression with idea parameter")
    public void givenProperString_ReturnCompression(){
        String string = "2a2b2c2d2e";
        Assertions.assertEquals(string, StringCompression.compress(string));

    }

    @Test
    @DisplayName("Test compression with  parameter of size 1")
    public void givenOneCharacterString_ReturnOriginalString(){
        String string = "a";
        Assertions.assertEquals(string, StringCompression.compress(string));
    }

    @Test
    @DisplayName("Test compression with null string")
    public void givenNullString_ThrowException(){
        String string = "";
       IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, ()->{ StringCompression.compress(string);});
       Assertions.assertEquals("String should not be null", exception.getMessage());
    }

}