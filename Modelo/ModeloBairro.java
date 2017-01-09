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
public class ModeloBairro {
    private int id_bairro;
    private String nome_bairro;
    private int id_cidade;

    /**
     * @return the id_bairro
     */
    public int getId_bairro() {
        return id_bairro;
    }

    /**
     * @param id_bairro the id_bairro to set
     */
    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }

    /**
     * @return the nome_bairro
     */
    public String getNome_bairro() {
        return nome_bairro;
    }

    /**
     * @param nome_bairro the nome_bairro to set
     */
    public void setNome_bairro(String nome_bairro) {
        this.nome_bairro = nome_bairro;
    }

    /**
     * @return the id_cidade
     */
    public int getId_cidade() {
        return id_cidade;
    }

    /**
     * @param id_cidade the id_cidade to set
     */
    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }
}
