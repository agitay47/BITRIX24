package com.Tesla.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/Login.feature:20",//@target/rerun.txt
        glue = "com/Tesla/step_definitions"


)

public class FailedTestRunner {
}
