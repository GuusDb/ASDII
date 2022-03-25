package projectorganizerstarter;

import domein.Deliverable;
import domein.ExternalTask;
import domein.Project;
import domein.Task;

public class TestDrive {

    public static void main(String[] arg) {

        System.out.println("Creating a demo Task and Deliverable");
        System.out.println();
        Project primaryProject = new Project();
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
        Project standaloneProject = new Project();
        standaloneProject.addProjectItem(new Deliverable("Lunar landing module",
                "Ask the local garage if they can make a few minor modifications to one of their cars",
                2800, 40.0, 35.0));

        System.out.println("Calculating the cost estimates using the Template Method, getCostEstimate.");
        System.out.println();
        System.out.println("Total cost estimate for: " + primaryProject);
        System.out.println("\t" + primaryProject.getCostEstimate());
        System.out.println();

        System.out.println("Total cost estimate for: " + standaloneProject);
        System.out.println("\t" + standaloneProject.getCostEstimate());
    }
}
