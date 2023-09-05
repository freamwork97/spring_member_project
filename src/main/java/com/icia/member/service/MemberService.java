package com.icia.member.service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.reposit.MemberReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//    public boolean login(MemberDTO memberDTO) {
//        int result = memberReposit.login(memberDTO);
//        if (result > 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }


    public MemberDTO login(MemberDTO memberDTO) {
        return memberReposit.login(memberDTO);
    }
}
