package testen;

import domein.Application;
import domein.ApplicationFactory;
//uncomment
//import domein.DrawingDocument;
//import domein.StatisticsDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApplication {

    @Test
    public void testDrawing() {
        Application application = ApplicationFactory.createApplication("drawing");
        application.addNewDocument("drawing1");
        application.addNewDocument("drawing2");
//uncomment
//        Assertions.assertTrue(application.getDocument("drawing1") instanceof DrawingDocument);
//        Assertions.assertTrue(application.getDocument("drawing2") instanceof DrawingDocument);
    }

    @Test
    public void testStatistics() {
        Application application = ApplicationFactory.createApplication("statistics");
        application.addNewDocument("stat1");
        application.addNewDocument("stat2");
//uncomment
//        Assertions.assertTrue(application.getDocument("stat1") instanceof StatisticsDocument);
//        Assertions.assertTrue(application.getDocument("stat2") instanceof StatisticsDocument);
    }
}
