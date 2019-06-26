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
// Simula un video en la BD		
		this.title = "Los barbaros";
			}

	public void addTags(List<String> tag) {
		System.out.println("Se agrega a la lista ");
		tags.addAll(tag);
	}
}
