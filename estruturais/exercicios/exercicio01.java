package com.mycompany.estruturascondicionais;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        
        System.out.println("Digite o sexo da pessoa:");
        sexo = sc.next().charAt(0);
        if(sexo == 'M' || sexo == 'F'){
            System.out.println("Sexo binário!");
        }
        else{
            System.out.println("Sexo não binário!");
        }
    }
}
