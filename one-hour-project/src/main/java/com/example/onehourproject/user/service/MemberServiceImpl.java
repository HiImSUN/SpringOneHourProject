package com.example.onehourproject.user.service;

import com.example.onehourproject.user.controller.dto.JoinRequest;
import com.example.onehourproject.user.repository.MemberRepository;
import com.example.onehourproject.user.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private  final MemberRepository memberRepository;
    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        memberRepository.save(member);
        return "success";
    }
}
