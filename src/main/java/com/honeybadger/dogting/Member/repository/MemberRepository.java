package com.honeybadger.dogting.Member.repository;

import com.honeybadger.dogting.Member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
