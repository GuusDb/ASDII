package domein;

public class KinderMenuDirector {

	public KinderMenu buildKinderMenu(
    		String hamburger, String drank,
            String dessert, String geschenk) 
	{
		return buildKinderMenu(null, hamburger, 
				drank, dessert, geschenk);
	}

	public KinderMenu buildKinderMenu( KinderMenuBuider builder,
    		String hamburger, String drank,
            String dessert, String geschenk) 
    {
        if (builder == null)
		      builder = new StandaardKinderMenuBuilder();
        
        builder.createNewKinderMenu();
        builder.buildHamburger(hamburger);
        builder.buildDrank(drank);
        builder.buildDessert(dessert);
        builder.buildGeschenk(geschenk);
        return builder.getKinderMenu();
    }
}
