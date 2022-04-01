package domein;

import java.util.List;

public class ReportDocument extends Document {

	public List<domein.Page> createPages() {
		return List.of(new IntroductionPage(), new SummaryPage(), new ConclusionPage(), new BibliographyPage());
	}
}
