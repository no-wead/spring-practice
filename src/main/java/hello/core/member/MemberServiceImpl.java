package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // interface 추상화에도 의존하고, 구체화에도 의존하고 있어서 DIP 위반.
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
