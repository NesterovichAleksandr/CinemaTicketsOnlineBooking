package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Seance;
import com.gmail.nesterovich.aleksandr.model.SeanceDto;

public class SeanceConvector {

    public static Seance convert(SeanceDto seanceDto){
        Seance seance = new Seance();
        seance.setId(seanceDto.getId());
        seance.setDate(seanceDto.getDate());
        seance.setTime(seanceDto.getTime());

        return seance;
    }

    public static SeanceDto convert(Seance seance){
        SeanceDto seanceDto = new SeanceDto();
        seanceDto.setId(seance.getId());
        seanceDto.setDate(seance.getDate());
        seanceDto.setTime(seance.getTime());

        return seanceDto;
    }
}
