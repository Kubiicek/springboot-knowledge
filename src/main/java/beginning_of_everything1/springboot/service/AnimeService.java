package beginning_of_everything1.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import beginning_of_everything1.springboot.domain.Anime;

@Service
public class AnimeService {
	private static List<Anime> animes;
	static {
		animes = new ArrayList<>(List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Berserk")));
	}
	
	//En: It's almost impossible to have a list because we don't want the user to know the entire database.
	//Br: quase impossivel ter um listall pois nao queremos que o usuario saiba todo o banco de dados
	
	//private final AnimeRepository animeRepository;
	public List<Anime> listAll() {
		return animes;
	}
	
	public Anime findById(long id) {
		return animes.stream()
				.filter(anime -> anime.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
	}
	
	public Anime save(Anime anime) {
		anime.setId(ThreadLocalRandom.current().nextLong(3, 100000));
		animes.add(anime);
		return anime;
	}
}
