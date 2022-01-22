package ifam.frameworks.ramonsilva.daoExemplos;

import ifam.frameworks.ramonsilva.model.Estado;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EstadoDAO {

    private EntityManager entityManager;
    public EstadoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void salvar(Estado estado){
        entityManager.persist(estado);
    }

    public Estado consultar(Integer id){
        return entityManager.find(Estado.class,18);
    }

    public void remover(Integer id){
        Estado estado =  entityManager.find(Estado.class,id);

        }

    public List<Estado> listar(){
        Query query = entityManager.createQuery(("select e from Estado e"));
        List<Estado> estados=query.getResultList();
        return estados;
    }
}
