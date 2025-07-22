package beginning_of_everything1.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import beginning_of_everything1.springboot.domain.Anime;
import beginning_of_everything1.springboot.exception.BadRequestException;
import beginning_of_everything1.springboot.mapper.AnimeMapper;
import beginning_of_everything1.springboot.repository.AnimeRepository;
import beginning_of_everything1.springboot.requests.AnimePostRequestBody;
import beginning_of_everything1.springboot.requests.AnimePutRequestBody;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeService {
	
	private final AnimeRepository animeRepository;
	
	public List<Anime> listAll() {
		return animeRepository.findAll();
	}
	
	public List<Anime> findByName(String name) {
		return animeRepository.findByName(name);
	}
	
	public Anime findByIdOrThrowBadRequestException(long id) {
		return animeRepository.findById(id)
				.orElseThrow(() -> new BadRequestException("Anime not Found"));
	}
	
	@Transactional
	public Anime save(AnimePostRequestBody animePostRequestBody) {
		return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
	}
	
	public void delete(long id) {
		animeRepository.delete(findByIdOrThrowBadRequestException(id));
	}

	public void replace(AnimePutRequestBody animePutRequestBody) {
		Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
		Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
		anime.setId(savedAnime.getId());
		animeRepository.save(anime);
	}
}
