package tudelft.gettingstarted;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    //@BeforeEach: run before each @test case /  @AfterEach
    //@BeforeAll: run one before all @test case / @AfterAll
    //@Disabled skip the testcase that below this command
    //@Test
    //一个testcase只查一个东西不要一个test case 然后assert好几个
    GettingStarted g;

    @BeforeEach
    public void setup() {
        g = new GettingStarted();
    }

    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }

//    @Test
//    public void badPractice() {
//    	int result = g.addFive(0);
//    	Assertions.assertEquals(5, result);
//    	result = g.addFive(1);
//    	Assertions.assertEquals(6, result);
//    	result = g.addFive(6);
//    	Assertions.assertEquals(11, result);
//    }
}
