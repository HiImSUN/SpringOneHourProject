package com.example.onehourproject.user.repository;

import com.example.onehourproject.user.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
