package kr.or.nextit.ditto.freeboard;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FreeBoardService {
    private final FreeBoardMapper mapper;

    public List<FreeBoardVO> getBoardList(){
        return mapper.getBoardList();
    }; // 모든 게시물을 조회하는 메서드
    public List<FreeBoardVO> searchBoardList(@Param("keyword") String keyword){
        return mapper.searchBoardList(keyword);
    };
}