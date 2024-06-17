package kr.or.nextit.ditto.seat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {
    private final SeatMapper mapper;

    List<SeatVO> selectSeat(){
        return mapper.selectSeat();
    }
}
