/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.source.cadastros;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MiltonRogerio
 */
public class VeiculoPessoaPK implements Serializable {

    private Long veiculo;
    private Long pessoa;

    public Long getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Long veiculo) {
        this.veiculo = veiculo;
    }

    public Long getPessoa() {
        return pessoa;
    }

    public void setPessoa(Long pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.veiculo);
        hash = 79 * hash + Objects.hashCode(this.pessoa);
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
        final VeiculoPessoaPK other = (VeiculoPessoaPK) obj;
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        return true;
    }
}
