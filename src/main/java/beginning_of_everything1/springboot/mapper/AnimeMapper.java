package beginning_of_everything1.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import beginning_of_everything1.springboot.domain.Anime;
import beginning_of_everything1.springboot.requests.AnimePostRequestBody;
import beginning_of_everything1.springboot.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
	public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
	
	public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
	
	public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
