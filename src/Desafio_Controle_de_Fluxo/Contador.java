package Desafio_Controle_de_Fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvadosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        } 
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvadosException {
        
        int contagem = parametroDois - parametroUm;
        for (int count = 1; count <= contagem; count++) {
            System.out.println("Imprimindo o número " + count);
        }
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvadosException();
        }

        }
    }
