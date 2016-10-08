/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtreversivel;

/**
 *
 * @author Augusto
 */
public class Fita {
    private int TAMFITA;
    private int posicao;
    private char[] fita;
    public Fita(char[] fita){
        this.fita = fita;
        this.TAMFITA = this.fita.length;
        this.posicao = 0;
    }
}
