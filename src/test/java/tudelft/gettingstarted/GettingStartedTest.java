package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    //@BeforeEach: run before each @test case /  @AfterEach
    //@BeforeAll: run one before all @test case / @AfterAll
    //@Disabled skip the testcase that below this command
    //@Test
    //一个testcase只查一个东西不要一个test case 然后assert好几个
    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

//    @Test
//    public void addFiveToZero() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(???, result);
//    }
//
//    @Test
//    public void addFiveToMinus20() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(????,result);
//    }
}
