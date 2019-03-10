package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Cinema;
import com.gmail.nesterovich.aleksandr.model.CinemaDto;

public class CinemaConvector {

    public static Cinema convert(CinemaDto cinemaDto){
        Cinema cinema = new Cinema();
        cinema.setId(cinemaDto.getId());
        cinema.setName(cinemaDto.getName());
        cinema.setAddress(AddressConvector.convert(cinemaDto.getAddress()));

        return cinema;
    }

    public static CinemaDto convert(Cinema cinema){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setId(cinema.getId());
        cinemaDto.setName(cinema.getName());
        cinemaDto.setAddress(AddressConvector.convert(cinema.getAddress()));

        return cinemaDto;
    }
}
