package domein;

import java.util.List;

public class ResumeDocument extends Document {

	public List<Page> createPages() {
		return List.of(new SkillsPage(), new EducationPage(), new ExperiencePage());
	}
}
