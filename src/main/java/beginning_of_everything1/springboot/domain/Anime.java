package beginning_of_everything1.springboot.domain;

public class Anime {
	private String name;
	
	public Anime(String name) {
		this.name = name;
	}
	
	public Anime() {
	}
	
	public String getAnime() {
		return name;
	}
	
	public void SetNome(String name) {
		this.name = name;
	}
}
