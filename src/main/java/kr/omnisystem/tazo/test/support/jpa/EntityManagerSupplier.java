/**
 * 
 */
package kr.omnisystem.tazo.test.support.jpa;

import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 * @author jooken
 *
 */
public class EntityManagerSupplier {
    public static void doIt(final EntityManagerFactory emf, Consumer<EntityManager> consumer) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            consumer.accept(em);
            tx.commit();
        } catch (Throwable th) {
            tx.rollback();
            throw th;
        } finally {
            em.close();
        }
    }
}
