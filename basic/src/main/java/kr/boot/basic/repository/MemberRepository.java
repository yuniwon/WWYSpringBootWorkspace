package kr.boot.basic.repository;

import kr.boot.basic.domain.Member;

import java.util.List;
import java.util.Optional;

//@Repository
public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
