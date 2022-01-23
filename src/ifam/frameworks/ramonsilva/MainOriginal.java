package ifam.frameworks.ramonsilva;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import javax.swing.*;

public class MainOriginal {
/*
    private static void inserir() {

        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA1");
        //EntityManager em = factory.createEntityManager();
        EntityManager em = JPAUtil.getEntityManager();


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
        Estado estado3 = new Estado();
        Estado estado4 = new Estado();

        estado1.setNome("Amazonas");
        estado1.setCodigoIBGE("13");
        estado1.setPais(pais1);
        estado2.setNome("São Paulo");
        estado2.setCodigoIBGE("35");
        estado2.setPais(pais1);
        estado3.setNome("ARENDELLE");
        estado3.setCodigoIBGE("456");
        estado3.setPais(pais2);
        estado4.setNome("NORTHURNDA");
        estado4.setCodigoIBGE("99");
        estado4.setPais(pais2);


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
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        Pessoa pessoa5 = new Pessoa();

        pessoa1.setDocumento("123.456.789-00");
        pessoa1.setNome("Elsa de Arendelle da Silva");
        pessoa1.setEndereco("Rua do Palacio N12, Bairro do gelo");
        pessoa1.setCidade(cidade4);
        pessoa1.setEmail("elsadearendelle@arendelle.com");
        pessoa1.setTelefone("9999-8888");
        pessoa1.setNascimento(LocalDateTime.of(1822,12,22,0,1));
        pessoa1.setSexo(SexoPessoaENUM.MASCULINO);
        pessoa1.setTipo(PessoaENUM.PROPRIETARIO);

        pessoa2.setDocumento("987.654.321-00");
        pessoa2.setNome("Merida de DunBroch");
        pessoa2.setEndereco("Rua das Terras Escocesas N40, Bairro de Pedra");
        pessoa2.setCidade(cidade1);
        pessoa2.setEmail("merida@terrasescocesas.com");
        pessoa2.setTelefone("7777-6666");
        pessoa2.setNascimento(LocalDateTime.of(1822,07,20,5,22));
        pessoa2.setSexo(SexoPessoaENUM.FEMININO);
        pessoa2.setTipo(PessoaENUM.CUIDADOR);

        pessoa3.setDocumento("741.852.963-00");
        pessoa3.setNome("Astrid Hofferson");
        pessoa3.setEndereco("Rua da Tempestade, Bairro do Dragao");
        pessoa3.setCidade(cidade2);
        pessoa3.setEmail("Astrid Hofferson@ilhadeBerk.com");
        pessoa3.setTelefone("9999-8888");
        pessoa3.setNascimento(LocalDateTime.of(1010,03,26,18,19));
        pessoa3.setSexo(SexoPessoaENUM.FEMININO);
        pessoa3.setTipo(PessoaENUM.PROPRIETARIO);

        pessoa4.setDocumento("888.315.450-94");
        pessoa4.setNome("Mulan Fa");
        pessoa4.setEndereco("Rua Oriental, Bairro Chines");
        pessoa4.setCidade(cidade3);
        pessoa4.setEmail("fa.mulan@chinaimperial.com");
        pessoa4.setTelefone("9999-8888");
        pessoa4.setNascimento(LocalDateTime.of(2000,6,06,23,9));
        pessoa4.setSexo(SexoPessoaENUM.MASCULINO);
        pessoa4.setTipo(PessoaENUM.CUIDADOR);

        pessoa5.setDocumento("453.827.720-70");
        pessoa5.setNome("Xan Irelia de Navori");
        pessoa5.setEndereco("Rua Celestial, Bairro de Ionia");
        pessoa5.setCidade(cidade4);
        pessoa5.setEmail("XanIrelia@ionia.com");
        pessoa5.setTelefone("9999-8888");
        pessoa5.setNascimento(LocalDateTime.of(1456,11,16,20,20));
        pessoa5.setSexo(SexoPessoaENUM.FEMININO);
        pessoa5.setTipo(PessoaENUM.CUIDADOR);

        Raca raca1 = new Raca();
        raca1.setNome("Dragão");
        Raca raca2 = new Raca();
        raca2.setNome("Cachorro");
        Raca raca3 = new Raca();
        raca3.setNome("Gato");
        Raca raca4 = new Raca();
        raca4.setNome("Coelho");

        //Cadastras linha dos pets

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();

        pet1.setNome("shi-fu");
        pet1.setNascimento(LocalDateTime.of(2021,05,23,0,0));
        pet1.setSexo(SexoPetENUM.MACHO);
        pet1.setProprietario(pessoa1);
        pet1.setRaca(raca1);

        pet2.setNome("Tempestade");
        pet2.setNascimento(LocalDateTime.of(2020,11,7,3,6));
        pet2.setSexo(SexoPetENUM.FEMEA);
        pet2.setProprietario(pessoa3);
        pet2.setRaca(raca2);

        pet3.setNome("Troglodita");
        pet3.setNascimento(LocalDateTime.of(2021,05,23,0,0));
        pet3.setSexo(SexoPetENUM.MACHO);
        pet3.setProprietario(pessoa5);
        pet3.setRaca(raca3);
        //Persistencia
        em.getTransaction().begin();
        em.persist(pais1);
        em.persist(pais2);
        em.persist(estado1);
        em.persist(estado2);
        em.persist(estado3);
        em.persist(estado4);

        em.persist(cidade1);
        em.persist(cidade2);
        em.persist(cidade3);
        em.persist(cidade4);
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(pessoa3);
        em.persist(pessoa4);
        em.persist(pessoa5);
        em.persist(raca1);
        em.persist(raca2);
        em.persist(raca3);
        em.persist(raca4);
        em.persist(pet1);
        em.persist(pet2);
        em.persist(pet3);
        em.persist(pet3);

        em.getTransaction().commit();
        em.close();

        JOptionPane.showConfirmDialog(null,"DEU TUDO CERTO","PetIsLife",1,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"FUNCIONOU!!!!!","POR JUSSARA",0,JOptionPane.ERROR_MESSAGE);

    }

    private static void removerEstado(){
        EntityManager em =JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Estado estado = em.find(Estado.class,6);
        em.remove(estado);
        em.close();
    }

    private static void consultar(){
        EntityManager em = JPAUtil.getEntityManager();
        Cidade cidade=em.find(Cidade.class, 7);

        System.out.println("Cidade - Id: "+cidade.getId());
        System.out.println("Cidade - Nome: "+cidade.getNome());

        Pessoa pessoa=em.find(Pessoa.class, "123.456.789-00");

        System.out.println("Rainha - Email: "+pessoa.getEmail());
        System.out.println("Rainha - Nome: "+pessoa.getNome());
        System.out.println("Rainha - Reino: "+pessoa.getCidade().getNome());

        Estado estado=em.find(Estado.class, 6);

        System.out.println("Estado Nome: "+estado.getNome());
        System.out.println("Estado Codigo: "+estado.getCodigoIBGE());
        System.out.println("Pais: "+estado.getPais().getNome());
    }

    public static void inserirComDao(){
        EntityManager em = JPAUtil.getEntityManager();
        Estado e =new Estado();
        e.setNome("Rio Grande do Norte");
        e.setCodigoIBGE("24");
        Pais pais =em.find(Pais.class,2);
        e.setPais(pais);

        EntityManager entityManager = JPAUtil.getEntityManager();
            //Injeção de deṕendencia
        EstadoDAO dao = new EstadoDAO(entityManager);
        entityManager.getTransaction().begin();

        dao.salvar(e);

        entityManager.getTransaction().commit();

        entityManager.close();

    }
    public static void consultarComDao(){
        EntityManager entityManager = JPAUtil.getEntityManager();
        //Injeção de deṕendencia
        EstadoDAO dao = new EstadoDAO(entityManager);
        entityManager.getTransaction().begin();
        Estado estado=dao.consultar(18);

        entityManager.getTransaction().commit();

        entityManager.close();
        System.out.println(estado);

    }

    private static void removerComDao(){
        EntityManager entityManager = JPAUtil.getEntityManager();
        //Injeção de deṕendencia
        EstadoDAO dao = new EstadoDAO(entityManager);
        entityManager.getTransaction().begin();
        dao.remover(18);

        entityManager.getTransaction().commit();

        entityManager.close();

    }

    private static void listarComDao(){

        EntityManager entityManager = JPAUtil.getEntityManager();
        //Injeção de deṕendencia
        EstadoDAO dao = new EstadoDAO(entityManager);
        entityManager.getTransaction().begin();
        List<Estado> estados=dao.listar();
        for(Estado e:estados){
            System.out.println(e);
        }
        entityManager.getTransaction().commit();

        entityManager.close();

    }
*/
    /*
    public Application(){ initComponents();}
     */
    public static void main(String[] args) {
      /*
        //inserir();
        //removerEstado();
        //  consultar();
        //inserirComDao();
        //consultarComDao();
        //removerComDao();
        //listarComDao();
        //java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastrosBase().setVisible(true);
            }
        });
        public void run(){
            new TelaCadastrosBase().set
        }

*/
    }
}