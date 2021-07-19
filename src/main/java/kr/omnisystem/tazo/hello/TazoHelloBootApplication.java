package kr.omnisystem.tazo.hello;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.omnisystem.tazo.hello.domain.MemberType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class TazoHelloBootApplication {

    public static void main(String[] args) {
        // SpringApplication.run(TazoHelloBootApplication.class, args);

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        try {
//            process(em);
//            tx.commit();
//        } catch (Throwable th) {
//            tx.rollback();
//            throw th;
//        } finally {
//            em.close();
//            emf.close();
//        }
    }

//    private static void process(final EntityManager em) {
//        log.debug("begin");
//        
//        TeamVO teamVO;
//        em.persist(teamVO = TeamVO.builder()
//                .teamName("foo")
//                .build());
//        
//        em.persist(MemberVO.builder()
//                .memberName("hello1")
//                .memberType(MemberType.USER)
//                .registerDate(new Date())
//                .teamVO(teamVO)
//                .build());
//        
//        em.persist(MemberVO.builder()
//                .memberName("hello2")
//                .memberType(MemberType.ADMIN)
//                .registerDate(new Date())
//                .teamVO(teamVO)
//                .build());
//        
//        em.persist(MemberVO.builder()
//                .memberName("hello3")
//                .memberType(MemberType.USER)
//                .registerDate(new Date())
//                .teamVO(teamVO)
//                .build());
//
//
//    }

}
