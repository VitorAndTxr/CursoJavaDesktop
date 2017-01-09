/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cogeti
 */
public class ModeloCidade {
    private int codigo;
    private int codigo_estado;
    private String nome;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the codigo_estado
     */
    public int getCodigo_estado() {
        return codigo_estado;
    }

    /**
     * @param codigo_estado the codigo_estado to set
     */
    public void setCodigo_estado(int codigo_estado) {
        this.codigo_estado = codigo_estado;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
