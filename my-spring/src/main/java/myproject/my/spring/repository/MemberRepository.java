package myproject.my.spring.repository;

import myproject.my.spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface  MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
