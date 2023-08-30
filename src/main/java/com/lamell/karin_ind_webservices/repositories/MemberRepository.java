package com.lamell.karin_ind_webservices.repositories;

import com.lamell.karin_ind_webservices.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
