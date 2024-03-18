package kr.boot.basic.service;

import kr.boot.basic.domain.Member;
import kr.boot.basic.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

//@Service
public class MemberService {

   private final MemberRepository memberRepository;

   public MemberService(MemberRepository memberRepository) {
       this.memberRepository = memberRepository;
   }

   //회원가입

    public void join(Member member) {
       if(validateDuplicateMember(member)) {
           throw new IllegalStateException("이미 존재하는 회원입니다.");
       }else {
           memberRepository.save(member);
       }
    }

    //아이디 중복 검사
    private boolean validateDuplicateMember(Member member) {
        return memberRepository.findByName(member.getName()).isPresent();
    }

    //전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    //회원 조회
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
