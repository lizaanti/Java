import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFourTest {

    @Test
    void sumOfNumbers() {
        TaskFour taskFour = new TaskFour();
        int actual = TaskFour.sumOfNumbers();
        int expected = 45;
        assertEquals(expected, actual);
    }
}