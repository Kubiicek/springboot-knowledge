package beginning_of_everything1.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import beginning_of_everything1.springboot.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
	
}
