package com.icia.member.controller;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/save")
    public String save() {
        return "memberSave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        boolean result = memberService.save(memberDTO);
        if (result) {
            System.out.println("학생등록 성공");
            return "memberLogin";
        } else {
            System.out.println("학생등록 실패");
            return "memberSave";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "memberLogin";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, Model model) {
        MemberDTO result = memberService.login(memberDTO);
//        System.out.println(result);
        if (result != null) {
            model.addAttribute("member",result);
            return "memberMain";
        } else {
            return "memberLogin";
        }
//        boolean result = memberService.login(memberDTO);
//        if (result) {
//            System.out.println("로그인 성공");
//            return "memberMain";
//        } else {
//            System.out.println("로그인 실패");
//            return "memberLogin";
//        }
    }

}
