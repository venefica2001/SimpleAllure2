import io.qameta.allure.junit4.DisplayName;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSuite2 {

    String currentDate;

    @Before
    public void initDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date date = new Date();
        currentDate = formatter.format(date);
    }

    @Test
    @DisplayName("fora")
    public void test1(){
        System.out.println("FirstTest"+currentDate);
        TestCase.fail("TEST1 FAILED - " + currentDate);
    }

    @Test
    @DisplayName("ff2 ")
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test
    public void test4(){
        System.out.println("test4");
        TestCase.fail("TEST4 FAILED - " + currentDate);
    }

    @Test
    public void test5(){
        System.out.println("test5");
    }

    @Test
    public void test6(){
        System.out.println("test6");
    }
}
