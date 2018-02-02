package be.kokw.restclient.controllers;


import be.kokw.restclient.entities.Member;
import be.kokw.restclient.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class MemberController {
    private MemberService service;

    @Autowired
    public void setService(MemberService service) {
        this.service = service;
    }

    @GetMapping("members")
    public String handleMembers(Map<String, Object> model) {
        Member member = new Member();
        model.put("memberForm", member);
        Map<String,String> genderList = new LinkedHashMap<String,String>();
        genderList.put("M", "Mannelijk");
        genderList.put("V", "Vrouwelijk");
        return "members/addMember";
    }

    @PostMapping("/members")
    public String handleGetMember(@ModelAttribute("memberForm") Member member, ModelMap model){
        model.addAttribute("member",service.addMember(member));
        return "members/memberCreated";
    }
}
