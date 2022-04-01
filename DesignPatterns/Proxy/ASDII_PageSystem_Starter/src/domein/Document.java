package domein;

import java.util.List;
import java.util.stream.Collectors;
public abstract class Document 
{

	public java.lang.String print() {
		throw new UnsupportedOperationException();
	}

	public abstract List<domein.Page> createPage();

    
    /*public String print() {
        /*return pages.stream()
                .map(Page::print)
                .collect(Collectors.joining("\n"));
    }*/
}
