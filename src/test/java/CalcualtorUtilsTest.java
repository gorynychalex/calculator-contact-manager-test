import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalcualtorUtilsTest {

    CalcualtorUtils calcualtorUtils;
    int a, b;

    @BeforeEach
    void setUp() {
        calcualtorUtils = new CalcualtorUtils();
        a = 15; b = 5;
    }

    @Test
    void add() {
        assertEquals((a+b),calcualtorUtils.add(a,b));

    }

    @Test
    void sub() {
        assertEquals((a-b),calcualtorUtils.sub(a,b));
    }

    @Test
    void multy() {
        assertEquals((a*b),calcualtorUtils.multy(a,b));
    }

    @Test
    void divide() {
        assertEquals((a/b),calcualtorUtils.divide(a,b));
        assertThrows(ArithmeticException.class,()->calcualtorUtils.divide(5,0));
    }

//    @Test(expected = Exception.class)
//    public void testThrowsException() throws Exception {
//        // ...
//    }

    @Test
    public void testThrowsException() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            //...
        });
    }

//    @Test(timeout = 10)
//    public void testFailWithTimeout() throws InterruptedException {
//        Thread.sleep(100);
//    }

    @Test
    void testFailWithTimeout() throws InterruptedException {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(100));
    }
}