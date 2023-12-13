package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class FramePage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static String readMessageSample() {
        Common.switchToFrame(Locator.DemoQa.Frames.frame2);
        System.out.println(Common.getListOfElements(Locator.DemoQa.Frames.headerSample));
        return Common.getText(Locator.DemoQa.Frames.headerSample);
    }

    public static String readDescription() {
        Common.swichToDefaultContent();
        return Common.getText(Locator.DemoQa.Frames.divDescription);
    }
}
