package com.sgl.msscbrewery.web.mappers;

import com.sgl.msscbrewery.domain.Beer;
import com.sgl.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beer);
}
