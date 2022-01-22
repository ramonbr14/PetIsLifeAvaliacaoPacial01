package ifam.frameworks.ramonsilva.daoExemplos;

import ifam.frameworks.ramonsilva.model.Pessoa;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;

public class PessoaDAO {
    public void salvar(Pessoa pessoa){
        EntityManager entityManager = JPAUtil.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(pessoa);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
