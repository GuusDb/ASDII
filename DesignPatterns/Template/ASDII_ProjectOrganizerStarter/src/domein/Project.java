package domein;

import java.util.*;

public class Project {

    private Set<ProjectItem> projectItems;

    public Project() {
        projectItems = new HashSet<>();
    }

    public void addProjectItem(ProjectItem element) {
        projectItems.add(element);
    }

    public void removeProjectItem(ProjectItem element) {
        projectItems.remove(element);
    }

    public double getCostEstimate() {
        return projectItems.stream()
                .mapToDouble(ProjectItem::getCostEstimate)
                .sum();
    }

    @Override
    public String toString() {
        return String.format("Project{projectItems= %s }", projectItems);
    }

}
