package br.com.sampleapp.test.runners;

import org.testng.annotations.Test;

import br.com.sampleapp.test.support.CustomTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@Test
@CucumberOptions(
		features = "src/main/resources/features/cadastro/",
		plugin = {"pretty", "html:target/cucumber"},
		glue = "br.com.sampleapp.test"
)
public class WebRunner extends CustomTestNGCucumberTests{

}