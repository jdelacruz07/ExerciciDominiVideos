import java.util.ArrayList;
import java.util.List;

public class Video {

	protected String url;
	protected String title;
	protected List<String> tags = new ArrayList<>();

	public Video(String url, String title) {
		this.url = url;
		this.title = title;
	}

	public Video() {
		System.out.println("Se crea el video");
		ArrayList<String> tag = new ArrayList<>();
		addTags(tag);
	}

	public void addTags(List<String> tags) {
		System.out.println("Se crea una lista");
	}
}
