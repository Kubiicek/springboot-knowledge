package beginning_of_everything1.springboot.controller;

import java.time.LocalDateTime;
import java.util.List;

import beginning_of_everything1.springboot.domain.Anime;
import beginning_of_everything1.springboot.util.DateUtil;
//import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
	// private DateUtil dateUtil;
	private final DateUtil dateUtil;
	
	@GetMapping(path = "list")
	public List<Anime> list() {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return List.of(new Anime("DBZ"),new Anime("Berserk"));
	}
}
