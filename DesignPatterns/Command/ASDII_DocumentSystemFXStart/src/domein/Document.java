package domein;

//RECEIVER
public class Document {

	private String tekst = "";
	
    public void erase(String zinnen)
    {
       tekst = tekst.replaceAll(zinnen, "");
    }

    public String readDocument()
    {
    	return tekst;
    }

	public void concat(String zinnen) 
	{ 
		tekst = tekst.concat(zinnen);
	}

}