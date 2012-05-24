package org.vanq.pages.bios;

import org.openqa.selenium.WebDriver;

public class TrevorAtkinsBio extends AbstractBioPage {

    public TrevorAtkinsBio(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "Trevor Atkins";
    }


}
