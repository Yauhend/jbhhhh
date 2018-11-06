import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.jupiter.api.Assertions;

public class ExampleSteps {
    int[] array = {1, 2, 3};


    @Given("array initialized")
    public void arrayInit() {
        for (var i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @When("reading array")
    public void arrayRead(){
        for (var element:array
             ) {
            System.out.println(element);
        }
    }

    @Then("assertion is good")
    public void assertionGood(){
        System.out.println("true");
        Assertions.assertEquals(true,true);
    }
}
