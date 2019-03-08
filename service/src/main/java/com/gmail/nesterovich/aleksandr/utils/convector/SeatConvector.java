package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Seat;
import com.gmail.nesterovich.aleksandr.model.SeatDto;

public class SeatConvector {

    public static Seat convert(SeatDto seatDto){
        Seat seat = new Seat();
        seat.setId(seatDto.getId());
        seat.setRow(seatDto.getRow());
        seat.setPlace(seatDto.getPlace());

        return seat;
    }

    public static SeatDto convert(Seat seat){
        SeatDto seatDto = new SeatDto();
        seatDto.setId(seat.getId());
        seatDto.setRow(seat.getRow());
        seatDto.setPlace(seat.getPlace());

        return seatDto;
    }
}
