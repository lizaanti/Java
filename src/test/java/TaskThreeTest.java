import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskThreeTest {

    @Test
    void multiplicationTableTestPositive() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        assertEquals(50, TaskThree.multiplicationTable());
        System.setIn(inputStream);
    }

    @Test
    void checkReturnException(){
        ByteArrayInputStream in = new ByteArrayInputStream("null".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        assertThrows(InputMismatchException.class, TaskThree::multiplicationTable);
        System.setIn(inputStream);
    }
}