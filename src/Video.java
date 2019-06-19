import java.util.ArrayList;
import java.util.List;

public class Video {
	
	private String url;
	private String title;
	private List<Tags> tags = new ArrayList<>();
	
	public Video(String url,String title) {
		this.url = url;
		this.title = title;
	}
	
	public void addTags(List<Tags> tags) {
		
	}
}


