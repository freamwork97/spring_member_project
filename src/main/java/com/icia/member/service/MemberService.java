package com.icia.member.service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.reposit.MemberReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberReposit memberReposit;


    public boolean save(MemberDTO memberDTO) {
        int result = memberReposit.save(memberDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }


    public MemberDTO login(MemberDTO memberDTO) {
        return memberReposit.login(memberDTO);
    }

    //    public boolean login(MemberDTO memberDTO){
                /*
                                ---로그인방법---
                1. 이메일, 비밀번호 두 값 모두 일치한는 db 조회결과를 가져옴(조회결과 있으면 로그인 성공)
                2. 이메일로 db에서 조회해서 서비스에서 비밀번호를 서로 비교하여 일치하면 로그인 성공
                 */
        //    memberDTO dto = memberReposit.login(memberDTO);
        //        if(dto!=null)
        //
        //    {
        //        return true;
        //    }else
        //
        //    {
        //        return false;
        //    }
    //}


    public List<MemberDTO> list() {
        return memberReposit.list();
    }


    public MemberDTO detail(int id) {
        return memberReposit.detail(id);
    }

    public void update(MemberDTO memberDTO) {
        memberReposit.update(memberDTO);
    }

    public void delete(int id) {
        memberReposit.delete(id);
    }

    public MemberDTO findbyMemberEmail(String memberEmail) {
        return memberReposit.findbyMemberEmail(memberEmail);
    }

    public String cemail(String memberEmail) {
        return memberReposit.cemail(memberEmail);
    }
}
