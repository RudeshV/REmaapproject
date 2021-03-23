package org.stepdefenition;

import org.utilities.BaseClass;

import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
@Before
public void beforeMethod() {
chromeBrowser();
launchUrl("https://saas.remaap.com/app/login");
maxWindow();
}


}
