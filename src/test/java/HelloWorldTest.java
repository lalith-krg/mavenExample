import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    HelloWorld obj = new HelloWorld();
    @Test
    public void factorialTruePositive(){
        assertEquals("True Positive ", 120, obj.factorial(5));
        assertEquals("True Positive ", 24, obj.factorial(4));
    }

}
