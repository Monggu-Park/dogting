package com.honeybadger.dogting.Member.controller;

import com.honeybadger.dogting.Member.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @GetMapping("/member/save")
    public String saveForm(){return "save";}

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memeberDTO){
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memeberDTO);
        return "index";
    }
}
