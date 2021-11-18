package ifam.frameworks.ramonsilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Raca {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nome;

    public Raca() {
    }

    public Raca(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Raca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
