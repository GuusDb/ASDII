package testen;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Deliverable;
import domein.ExternalTask;
import domein.Project;
import domein.Task;

public class ProjectTest {
    private final double PRECISION = 0.0000001;
    Project primaryProject = new Project();
    Project standaloneProject = new Project();

    @BeforeEach
    public void before() {
        primaryProject.addProjectItem(new Task("Put a JVM on the moon", "Lunar mission as part of the JavaSpace program",
                240.0, 100.0));
        primaryProject.addProjectItem(new Task("Establish ground control", "Ground works",
                1000.0, 10.0));
        primaryProject.addProjectItem(new Task("Train the Javanaughts", "Training",
                80.0, 30.0));
        primaryProject.addProjectItem(new Deliverable("Moon travel clothes", "Customized clothes for Javanaughts",
                550, 15.0, 25.0));
        primaryProject.addProjectItem(new ExternalTask("Tune advanced lunar sensor", "Job for German company",
                20.0, 150.0));
        standaloneProject.addProjectItem(new Deliverable("Lunar landing module",
                "Ask the local garage if they can make a few minor modifications to one of their cars",
                2800, 40.0, 35.0));
    }
    
    @Test
    public void costEstimatePrimary(){
        assertEquals(40955.0, primaryProject.getCostEstimate(),PRECISION);
    }
        @Test
    public void costEstimateStandAlone(){
        assertEquals(4200.0, standaloneProject.getCostEstimate(),PRECISION);
    }

}
