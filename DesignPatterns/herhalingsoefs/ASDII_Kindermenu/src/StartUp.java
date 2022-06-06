import domein.KinderMenu;

public class StartUp {

	public static void main(String[] args) {
		new StartUp().run();
	}
	
	public void run()
	{
		KinderMenu menu1 = new KinderMenu.Builder()
                .hamburger("cheeseBurger")
                .drank("cola")
                .dessert("ijsje")
                .geschenk("tol").build();
               

        KinderMenu menu2 = new KinderMenu.Builder()
                .dessert("koek")
                .geschenk("bal")
                .hamburger("cheeseBurger")
                .drank("limonade").build();
               

        System.out.println(menu1);
		
		System.out.println(menu2);
		
	}

}
