package domein;

import java.util.List;

public class ReportDocument extends Document {

	public List<Page> createPage() {
		return List.of(new IntroductionPage(), new SummaryPage(), new ConclusionPage(), new BibliographyPage());
	}
}
