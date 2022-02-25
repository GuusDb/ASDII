package domein;

import java.util.Iterator;

public abstract class MenuComponent {
	
	private java.lang.String name;
	private java.lang.String description;
	
		
	
	
		public MenuComponent(String name, String description) {
			this.name = name;
			this.description = description;
		 }


		public java.lang.String getName() {
			return name;
		}
	
	
		public java.lang.String getDescription() {
			return description;
		}
		
		public abstract void print();

		//leaf
		
		public double getPrice() {
	    	throw new UnsupportedOperationException();
	    }

	    public boolean isVegetarian() {
	        throw new UnsupportedOperationException();
	    }



		//composiet
		public void add(MenuComponent menuComponent) {
			throw new UnsupportedOperationException();
		}

		public void remove(MenuComponent menuComponent) {
			throw new UnsupportedOperationException();
		}

		public MenuComponent getChild(int i) {
			throw new UnsupportedOperationException();
		}


}