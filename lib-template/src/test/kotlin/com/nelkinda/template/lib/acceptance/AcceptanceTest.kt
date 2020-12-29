package com.nelkinda.template.lib.acceptance // TODO change

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.platform.engine.Cucumber
import org.junit.runner.RunWith

@CucumberOptions(features = ["src/test/resources/features"], tags = "not(@wip) and not(@future)")
@RunWith(
    io.cucumber.junit.Cucumber::class
)
@Cucumber
class AcceptanceTest
