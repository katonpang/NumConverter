import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void testConvertToWordsZero() {
        String result = Conversion.ConvertToWords(0);
        assertEquals("zero", result);
    }

}