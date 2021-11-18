package ifam.frameworks.ramonsilva;

import ifam.frameworks.ramonsilva.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA1");
        EntityManager em = factory.createEntityManager();


        //Criando Objetos
        //Pais
        Pais pais1 = new Pais();
        Pais pais2 = new Pais();

        pais1.setCodidoISO("BRA");
        pais1.setNome("Brasil");
        pais2.setCodidoISO("URU");
        pais2.setNome("Uruguai");

        //Estado
        Estado estado1 = new Estado();
        Estado estado2 = new Estado();

        estado1.setNome("Amazonas");
        estado1.setCodigoIBGE("13");
        estado1.setPais(pais1);
        estado2.setNome("São Paulo");
        estado2.setCodigoIBGE("35");
        estado2.setPais(pais1);

        //Cidade
        Cidade cidade1 = new Cidade();
        Cidade cidade2 = new Cidade();
        Cidade cidade3 = new Cidade();
        Cidade cidade4 = new Cidade();

        cidade1.setCodigoIBGE("3550308");
        cidade1.setNome("Sao Paulo");
        cidade1.setEstado(estado2);
        cidade2.setCodigoIBGE("3534401");
        cidade2.setNome("Osasco");
        cidade2.setEstado(estado2);
        cidade3.setCodigoIBGE("301852");
        cidade3.setNome("Iranduba");
        cidade3.setEstado(estado1);
        cidade4.setCodigoIBGE("302603");
        cidade4.setNome("Manaus");
        cidade4.setEstado(estado1);

        //Pessoa
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setDocumento("123.456.789-00");
        pessoa1.setNome("Elsa de Arendelle da Silva");
        pessoa1.setEndereco("Rua do Palacio N12, Bairro do gelo");
        pessoa1.setCidade(cidade4);
        pessoa1.setEmail("elsadearendelle@arendelle.com");
        pessoa1.setTelefone("9999-8888");
        pessoa1.setNascimento(LocalDateTime.of(1822,12,22,0,1));
        pessoa1.setSexo(SexoPessoaENUM.MASCULINO);
        pessoa1.setTipo(PessoaENUM.PROPRIETARIO);

        //Cadastras linha dos pets


        //Persistencia
        em.getTransaction().begin();
        em.persist(pais1);
        em.persist(pais2);
        em.persist(estado1);
        em.persist(estado2);
        em.persist(cidade1);
        em.persist(cidade2);
        em.persist(cidade3);
        em.persist(cidade4);
        em.persist(pessoa1);
        em.getTransaction().commit();
        em.close();

        JOptionPane.showConfirmDialog(null,"DEU TUDO CERTO","PetIsLife",1,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"FUNCIONOU!!!!!","POR JUSSARA",0,JOptionPane.ERROR_MESSAGE);

    }
}
