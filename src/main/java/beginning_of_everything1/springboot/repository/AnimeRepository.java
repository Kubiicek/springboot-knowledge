package beginning_of_everything1.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import beginning_of_everything1.springboot.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
	
	List<Anime> findByName(String name);
}
