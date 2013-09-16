/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.source.cadastros;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author MiltonRogerio
 */
@Entity
@Table(name = "pessoa")
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "tp_pessoa")
// @DiscriminatorValue(value = "P")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nome;
    @Column(length = 30)
    private String nomefantasia;
    @Column(length = 15)
    private String fone;
    @Column(length = 15)
    private String fonefax;
    @Column(length = 15)
    private String fonecel;
    @Column(length = 40)
    private String email;
    @Column(length = 3)
    private String grupo;
    @Column(columnDefinition = "NUMERIC(18,2) DEFAULT 0.0")
    private double limitecre;
    @Column(length = 1)
    private String ativo;
    @Column(length = 14)
    private String cpjcnpj;
    @Column(length = 18)
    private String rg;
    @Column(length = 18)
    private String ie;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idendpessoa")
    private Endereco endereco;
    @Temporal(TemporalType.DATE)
    private Date dtcadastro;
    @Temporal(TemporalType.DATE)
    private Date dtnascimento;
    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFonefax() {
        return fonefax;
    }

    public void setFonefax(String fonefax) {
        this.fonefax = fonefax;
    }

    public String getFonecel() {
        return fonecel;
    }

    public void setFonecel(String fonecel) {
        this.fonecel = fonecel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getLimitecre() {
        return limitecre;
    }

    public void setLimitecre(double limitecre) {
        this.limitecre = limitecre;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCpjcnpj() {
        return cpjcnpj;
    }

    public void setCpjcnpj(String cpjcnpj) {
        this.cpjcnpj = cpjcnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public String toString() {
        return "br.tecnocar.source.cadastros.Pessoa[ id=" + id + " ]";
    }
}
