package com.example.onehourproject.member.repository;

import com.example.onehourproject.user.repository.MemberRepository;
import com.example.onehourproject.user.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("flature")
                .name("플레처")
                .phoneNumber("010-0000-0000")
                .build();

        //create test
        memberRepository.save(member);

        //get test
        Member foundMember = memberRepository.findById(1L).get();
    }
}
