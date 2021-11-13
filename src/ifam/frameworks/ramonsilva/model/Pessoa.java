package ifam.frameworks.ramonsilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Pessoa {
    @Id
    @Column(unique = true,nullable = false)
    private String documento;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    private String endereco;
    private String email;
    @Column(nullable = false)
    private Cidade cidade;
    @Enumerated
    private SexoPessoaENUM sexo;
    @Enumerated
    private PessoaENUM tipo;
    @Column(nullable = false)
    private LocalDateTime nascimento;

    public Pessoa() {
    }

    public Pessoa(String documento, String nome, String telefone, String endereco, String email,
                  Cidade cidade, SexoPessoaENUM sexo, PessoaENUM tipo) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.cidade = cidade;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public SexoPessoaENUM getSexo() {
        return sexo;
    }

    public void setSexo(SexoPessoaENUM sexo) {
        this.sexo = sexo;
    }

    public PessoaENUM getTipo() {
        return tipo;
    }

    public void setTipo(PessoaENUM tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "documento='" + documento + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", cidade=" + cidade +
                ", sexo=" + sexo +
                ", tipo=" + tipo +
                '}';
    }
}

