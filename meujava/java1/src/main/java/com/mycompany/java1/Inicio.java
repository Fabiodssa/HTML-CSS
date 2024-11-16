
package com.mycompany.java1;
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) { //psvm
        Scanner recebe=new  Scanner(System.in);
        System.out.println("Digite seu nome e depois sua nota:");
        String nome=recebe.nextLine();
        float nota=recebe.nextFloat();
        System.out.printf("seu nome : %s \nsua nota: %.2f", nome, nota);
    }
}
