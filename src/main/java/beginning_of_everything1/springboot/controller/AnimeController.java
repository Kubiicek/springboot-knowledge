package beginning_of_everything1.springboot.controller;

import java.time.LocalDateTime;
import java.util.List;

import beginning_of_everything1.springboot.domain.Anime;
import beginning_of_everything1.springboot.service.AnimeService;
import beginning_of_everything1.springboot.util.DateUtil;
//import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor // needs final
public class AnimeController {
	// private DateUtil dateUtil;
	private final DateUtil dateUtil;
	private final AnimeService animeService;
	
	@GetMapping
	public ResponseEntity<List<Anime>> list() {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(animeService.listAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Anime> findById(@PathVariable long id) {
		return ResponseEntity.ok(animeService.findById(id));
	}
	
}
