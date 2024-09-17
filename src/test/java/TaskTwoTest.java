import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    @Test
    void findMinNum() {
        TaskTwo taskTwo = new TaskTwo();
        int actual = TaskTwo.findMinNum();
        int expected = -4;
        assertEquals(expected, actual);


    }
}