import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic1")
@Feature("Feature 1")
public class CalculatorTest {

    @Test
    @Story("User story1")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag1")
    @Link("https://www.swtestacademy.com/allure-report-junit/")
    public void testAdd() {
        Calculator calc = new Calculator();

        Assertions.assertEquals(5, calc.add(2, 3));
    }

    private Calculator createCalc() {
        return new Calculator();
    }


    @Test
    @Story("User story2")
    @Description("Description related to testAddWithNegative test")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("123")
    @Step("Step1")
    @Tag("Tag2")
    public void testAddWithNegative() {
        Calculator calc = new Calculator();

        Assertions.assertEquals(-6, calc.add(-2, -3));
    }
}
