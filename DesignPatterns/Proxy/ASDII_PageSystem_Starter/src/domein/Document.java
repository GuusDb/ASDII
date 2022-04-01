package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public abstract class Document 
{
	private List<Page> pages;

	public Document() {
		pages = createPages();
	}

	public abstract List<Page> createPages();

    
    public String print() {
        return pages.stream()
                .map(Page::print)
                .collect(Collectors.joining("\n"));
    }
}
