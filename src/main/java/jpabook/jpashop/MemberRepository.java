package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(MemberTest memberTest) {
        em.persist(memberTest);

        return memberTest.getId();
    }

    public MemberTest find(Long id) {
        return em.find(MemberTest.class, id);
    }
}
