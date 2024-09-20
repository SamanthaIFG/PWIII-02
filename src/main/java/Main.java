import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.pagamento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pagamentosPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        pagamento pg = new pagamento();
        pg.setValor(500);
        pg.setData(new Date());
        System.out.println(pg);
        entityManager.persist(pg);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();

    }
}
