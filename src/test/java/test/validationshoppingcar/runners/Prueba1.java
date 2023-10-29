package test.validationshoppingcar.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features="src/test/resources/features/shopping.feature",
        glue="test.validationshoppingcar.stepdefinitions",
        tags = "@prueba1",
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class Prueba1 {
}
