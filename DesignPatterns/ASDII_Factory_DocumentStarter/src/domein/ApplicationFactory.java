package domein;

//SIMPLE FACTORY
public class ApplicationFactory {
    
    public static Application createApplication(String type) {
        return switch (type.toLowerCase()) {
        //Uncomment
           case "drawing" ->
                new DrawingApplication();
            case "statistics" ->
                new StatisticsApplication();
            default ->
                null;
        };
    }
}
