/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* welcome */

package app;

import dao.Dao;
import dao.PessoaDaoVetor;
import modelo.Pessoa;


public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao","Silva",20);
        Pessoa pedro = new Pessoa("Pedro","Silva",30);
        Pessoa jose = new Pessoa("José","Silva",5);
        Dao dao = new PessoaDaoVetor(2);

       
        dao.adicionar(joao);
        dao.adicionar(pedro);
        dao.adicionar(jose);
        dao.listarTudo();
        dao.remover(pedro);
        dao.listarTudo();
   
    }
}
