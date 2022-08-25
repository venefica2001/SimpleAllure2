import io.qameta.allure.junit4.DisplayName;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSuite1 {

    String currentDate;

    @Before
    public void initDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date date = new Date();
        currentDate = formatter.format(date);
    }

    @Test
    @DisplayName("Test 1")
    public void test1(){
        System.out.println("FirstTest"+currentDate);
    }

    @Test
    @DisplayName("Test 2 should fail")
    public void test2(){
        System.out.println("test2");
        TestCase.fail("TEST FAILED - " + currentDate);
    }

    @Test
    @DisplayName("Test 3 should be broken")
    public void test3() throws Exception {
        System.out.println("test3");
        throw new Exception();
    }

    @Test
    @DisplayName("Test 4")
    public void test4(){
        System.out.println("test4");
    }

    @Test
    @DisplayName("Test 5")
    public void test5(){
        System.out.println("test5");
    }

    @Test
    @DisplayName("Test 6")
    public void test6(){
        System.out.println("test6");
    }
}
