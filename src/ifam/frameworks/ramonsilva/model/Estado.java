package ifam.frameworks.ramonsilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Estado {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true,nullable = false)
    private String codigoIBGE;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Pais pais;

    public Estado() {

    }

    public Estado(String codigoIBGE, String nome, Pais pais) {
        this.codigoIBGE = codigoIBGE;
        this.nome = nome;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", codigoIBGE='" + codigoIBGE + '\'' +
                ", nome='" + nome + '\'' +
                ", pais=" + pais +
                '}';
    }
}
