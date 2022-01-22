package ifam.frameworks.ramonsilva.dao;



import ifam.frameworks.ramonsilva.util.JPAUtil;
import ifam.frameworks.ramonsilva.model.*;
import javax.persistence.EntityManager;

public class InserirJPA {

    static EntityManager entityInserir = JPAUtil.getEntityManager();

    public static void inserirPais(String codigoiso,String nome){
        Pais pais = new Pais();
        pais.setNome(nome);
        pais.setCodidoISO(codigoiso);

        entityInserir.persist(pais);
    }

    public static void inserirEstado(String codigoIbge,String nome, Pais pais){
        Estado estado = new Estado();
        estado.setNome(nome);
        estado.setCodigoIBGE(codigoIbge);
        estado.setNome(nome);
        estado.setPais(pais);

        entityInserir.persist(estado);
    }
    //Continuar criando os metodos de Inserir
}
