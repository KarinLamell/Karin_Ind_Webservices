package com.lamell.karin_ind_webservices.controller;

import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.services.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {

@Autowired
    private Memberservice memberService;

    public MemberController() {
    }

    public MemberController(Memberservice memberService) {
        this.memberService = memberService;
    }

    @PostMapping("newuser")
    public ResponseEntity<Member> saveUser(@RequestBody Member member){
        return new ResponseEntity<>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<Member> getAllMembers() {return memberService.getAllMembers();}

    /*@GetMapping("/api/members/{id}")
    public List<Member> getAllMembers() {return memberService.getAllMembers();}*/



}
