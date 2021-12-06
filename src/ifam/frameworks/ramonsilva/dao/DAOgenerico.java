package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;

public class DAOgenerico<Tipo> {
    private EntityManager entityManager;
    private Class<Tipo> classe;

    public DAOgenerico(EntityManager entityManager, Class<Tipo> classe){
        this.entityManager = entityManager;
        this.classe = classe;
    }

    public void salvar(Tipo objeto){
        entityManager.persist(objeto);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public Tipo consultar(Integer id){
        Tipo objeto =  entityManager.find(classe,id);
        return objeto;
    }

    public void remover(Integer id){
        Tipo objeto =  entityManager.find(classe,id);

        entityManager.remove(objeto);
    }


}
