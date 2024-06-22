package kr.or.nextit.ditto.member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper mapper;

    public MemberVO findMember(MemberVO memberVO) {
        return mapper.findMember(memberVO);
    }

    public int checkIdIsDuplicated(String memberId) {
        return mapper.checkIdIsDuplicated(memberId);
    }

    public int checkNicknameIsDuplicated(String memberNickname) {
        return mapper.checkNicknameIsDuplicated(memberNickname);
    }

    public int signUp(MemberVO memberVO) {
        return mapper.signup(memberVO);
    }

    public MemberVO searchMemberInfo(String memberId) {
        return mapper.searchMemberInfo(memberId);
    }
    public void passwordChange(MemberVO post){
        mapper.passwordChange(post); // 마이페이지 비밀번호 수정
    }
    public void updateMemberData(MemberVO post){
        mapper.updateMemberData(post); // 마이페이지 회원정보 수정
    }
    public List<MemberVO> adminPageMemberList(){
        return mapper.adminPageMemberList();
    } // 관리자 페이지 회원 정보 리스트

    public List<MemberVO> adminPageSearchMemberList(MemberVO memberId){
        return mapper.adminPageSearchMemberList(memberId); // 관리자 페이지 검색아이디 회원 정보
    }

    public void adminPageMemberDeleteY(MemberVO memberId){
        mapper.adminPageMemberDeleteY(memberId); // 관리자 페이지 회원 비활성화
    }
    public void adminPageMemberDeleteN(MemberVO memberId){
        mapper.adminPageMemberDeleteN(memberId); // 관리자 페이지 회원 활성화
    }

    public void adminMemberSubStatus(MemberVO memberVO){// 관리자 페이지 멤버십 상태변경
        if (Objects.equals(memberVO.getMemberSub(), "Y")) {
            memberVO.setMemberSub("N");
        } else {
            memberVO.setMemberSub("Y");
        }
        mapper.adminMemberSubStatus(memberVO);
    }


}