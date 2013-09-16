/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.source.cadastros;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author MiltonRogerio
 */
@Entity
@IdClass(VeiculoPessoaPK.class)
public class VeiculoPessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Veiculo veiculo;
    @Id
    private Pessoa pessoa;
    private boolean proprietario;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isProprietario() {
        return proprietario;
    }

    public void setProprietario(boolean proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.veiculo);
        hash = 53 * hash + Objects.hashCode(this.pessoa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VeiculoPessoa other = (VeiculoPessoa) obj;
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        return true;
    }
}
