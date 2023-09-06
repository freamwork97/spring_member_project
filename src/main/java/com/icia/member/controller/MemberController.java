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

import javax.servlet.http.HttpSession;
import java.util.List;

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
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session, Model model) {
//        System.out.println(result);
        MemberDTO result=  memberService.login(memberDTO);
        if ( result!= null) {
            // 모델에 이메일 저장
            model.addAttribute("member",result);
            //          로그인 성공시 사용자 이메일을 세션에 저장
            session.setAttribute("loginEmail",memberDTO.getMemberEmail());
            return "memberMain";
        } else {
            return "memberLogin";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        // 아래 방법중 하나만 사용
        // 해당 파라미터만 없앨 경우
        session.removeAttribute("loginEmail");
        // 세션 전체를 없앨 경우
//        session.invalidate();
        return "redirect:/";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
//        boolean login =memberService.login(memberDTO);
//        if (login) {
    //        로그인 성공시 사용자 이메일을 세션에 저장
    //        session.setAttribute("loginEmail", memberDTO.getMemberEmail());
//            return "memberMain";
//        } else {
//            return "memberLogin";
//        }
//
//    }

    @GetMapping("/members")
    public String list(Model model) { // 가져갈게 있을 때 Model사용
        List<MemberDTO> memberDTOList = memberService.list();
        System.out.println("memberList = " + memberDTOList);
        model.addAttribute("memberList", memberDTOList); // 화면에 가져갈 데이터
        return "memberList"; // 브라우저에 출력할 jsp 파일 이름
    }

    @GetMapping("/member")
    public String detail(@RequestParam("id") int id, Model model) {
        MemberDTO memberDTO = memberService.detail(id);
        System.out.println(id);
        model.addAttribute("member", memberDTO);
        return "memberDetail";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        MemberDTO memberDTO = memberService.detail(id);
        model.addAttribute("member", memberDTO);

//        System.out.println("id = " + id);
        return "memberUpdate";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MemberDTO memberDTO) {
        memberService.update(memberDTO);
//        System.out.println("studentDTO = " + studentDTO);
        return "memberMain";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        memberService.delete(id);
        return "redirect:/members";
    }
}
