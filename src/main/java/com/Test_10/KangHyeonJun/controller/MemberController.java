package com.Test_10.KangHyeonJun.controller;

import com.Test_10.KangHyeonJun.dto.MemberDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/members")
@Controller
public class MemberController {
    @GetMapping("/signup")
    public String showSignUp(MemberDTO dto) {
        return "/members/signUp";
    }

    @PostMapping("/signup")
    public String processSignUp(@Valid MemberDTO dto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/members/signUp";
        }

        return "redirect:/";
    }
}

