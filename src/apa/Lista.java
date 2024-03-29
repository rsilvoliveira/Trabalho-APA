/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Rodrigo
 */
public class Lista {

    ArrayList<Integer> lista;

    public Lista(int tam) {
        lista = new ArrayList();
        for (int i = 0; i < tam; i++) {
            this.lista.add(i);
        }
    }

    public void shuffle(int t,int n) {
        Random r = new Random();
        switch (t) {
            case 1://EMBARALHA TUDO
                Collections.shuffle(this.lista); 
                break;
            case 2://UMA TROCA - TROCA UMA POSICAO COM A PROXIMA
                int aux = r.nextInt(lista.size() - 2);
                Collections.swap(lista, aux, aux + 1);
                break;
            case 3: // UMA TROCA - TROCA UMA POSICAO COM OUTRA ALEATORIA
                Collections.swap(lista, r.nextInt(lista.size() - 1), r.nextInt(lista.size() - 1));
                break;
            case 4: //N TROCAS
                for(int i=0;i<n;i++){
                    Collections.swap(lista, r.nextInt(lista.size() - 2), r.nextInt(lista.size() - 2));
                }
                break;
            case 5:
                int x=this.lista.size()-1;
                this.lista.clear();
                for(int i=0;i<x+1;i++){
                    this.lista.add(x-i);
                }
                break;
            default:
                break;
        }
    }

    public void imprime() {
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.print(this.lista.get(i) + " ");
        }
         System.out.println("");
    }
}
