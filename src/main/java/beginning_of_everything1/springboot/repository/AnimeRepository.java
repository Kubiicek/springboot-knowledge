package beginning_of_everything1.springboot.repository;

import java.util.List;

import beginning_of_everything1.springboot.domain.Anime;

public interface AnimeRepository {
	List<Anime> listAll();
}
