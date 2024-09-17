import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskOneTest {

    @Test
    void checkingForAnEvenNumberTestPositive() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        assertTrue(TaskOne.checkingForAnEvenNumber());
        System.setIn(inputStream);
    }

    @Test
    void checkingForAnEvenNumberTestNegative() throws IOException{
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        assertFalse(TaskOne.checkingForAnEvenNumber());
        System.setIn(inputStream);
    }
}