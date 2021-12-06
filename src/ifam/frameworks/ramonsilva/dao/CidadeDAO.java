package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.model.Cidade;
import ifam.frameworks.ramonsilva.model.Estado;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CidadeDAO {

    public void salvar(Cidade cidade){
        EntityManager entityManager = JPAUtil.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(cidade);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public Cidade consultar(Integer id){
        EntityManager em = JPAUtil.getEntityManager();
        Cidade cidade = em.find(Cidade.class, id);
        em.close();
        return cidade;
    }

    public void remover(Integer id){
        EntityManager entityManager = JPAUtil.getEntityManager();
        entityManager.getTransaction().begin();

        Cidade cidade =  entityManager.find(Cidade.class,id);

        entityManager.remove(cidade);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public List<Cidade> listar(){
        EntityManager entityManager = JPAUtil.getEntityManager();
        Query query = entityManager.createQuery(("select c from Cidade c"));
        List<Cidade> cidades=query.getResultList();
        return cidades;
    }
}
