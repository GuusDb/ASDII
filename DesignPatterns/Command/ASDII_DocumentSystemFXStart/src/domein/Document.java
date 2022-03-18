package domein;

//RECEIVER
public class Document {

	private String tekst = "";
	

    public String readDocument()
    {
    	return tekst;
    }

	public void concat(String zinnen) 
	{ 
		tekst = tekst.concat(zinnen);
	}
	public void erase(String zinnen) {
	      tekst = tekst.replaceFirst(zinnen, "");
	        //tekst = tekst.replaceAll(zinnen, "");
	}
	    
	    
	 public void removeAtEnd(String zinnen) {
	        tekst = tekst.substring(0, tekst.length() - zinnen.length());
	    }

	    public int getFirstIndexOf(String zinnen) {
	        return tekst.indexOf(zinnen);
	    }

	    public void insert(String zinnen, int index) {
	        String start = tekst.substring(0, index);
	        String end = "";
	        if (index < tekst.length()) {
	            end = tekst.substring(index, tekst.length());
	        }
	        tekst = start.concat(zinnen).concat(end);
	    }	

}