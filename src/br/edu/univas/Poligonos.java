package br.edu.univas;

import java.util.Scanner;

public class Poligonos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String opcao;
        boolean menu = true;
        do{
            System.out.println("###########################");
            System.out.println("#   Escolha uma opção:" + "    #");
            System.out.println("#   1 - Quadrado" + "          #");
            System.out.println("#   2 - Triangulo regular" + " #");
            System.out.println("#   3 - Hexagono" + "          #");
            System.out.println("#   4 - Dodecagono" + "        #");
            System.out.println("#   9 - Sair" + "              #");
            System.out.println("###########################");
            opcao = scan.next();
            switch (opcao){
                case "1": {
                    System.out.println("Você escolheu o Quadrado:");
                    System.out.println("Por Favor digite o valor do primeiro lado:");
                    float side = scan.nextFloat();
                    float angle = side * 2;
                    System.out.println("A área do quadrado é igual á:" + angle);
                    break;
                }
                case "2": {
                    System.out.println("Você escolheu o Triangulo Regular:");
                    System.out.println("Por Favor digite o valor da base:");
                    float side = scan.nextFloat();
                    System.out.println("Por Favor digite o valor da altura:");
                    float hight = scan.nextFloat();
                    float angle = side * hight / 2;
                    System.out.println("A área do triangulo é igual á:" + angle);
                    break;
                }
                case "3": {
                    System.out.println("Você escolheu o Hexagono:");
                    System.out.println("Por Favor digite o valor da base:");
                    float base = scan.nextFloat();
                    System.out.println("Por Favor digite o valor da altura:");
                    float hight = scan.nextFloat();
                    float angle = base * hight * 6 / 2;
                    System.out.println("A área do Hexagono é:" + angle);
                    break;
                }
                case "4": {
                    System.out.println("Você escolheu o Dodecagono:");
                    System.out.println("Por Favor digite o valor do lado:");
                    float side = scan.nextFloat();
                    System.out.println("Por Favor digite o valor do angulo:");
                    float sideS = scan.nextFloat();
                    float angle = side * 5 * sideS / 2;
                    System.out.println("A área do Pentagono é igual a:" + angle);
                    break;
                }
                case "9":
                    menu = false;
                    System.out.println("Você acabou!!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite uma opção correta!");
                    break;

            }
        }while(menu == true);
    }

}

