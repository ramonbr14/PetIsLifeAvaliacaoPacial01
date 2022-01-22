package ifam.frameworks.ramonsilva.daoExemplos;

import ifam.frameworks.ramonsilva.model.Pais;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;

public class PaisDAO {
    public void salvar(Pais pais){
        EntityManager entityManager = JPAUtil.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(pais);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
