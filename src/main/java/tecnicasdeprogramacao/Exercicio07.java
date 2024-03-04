/*
 * Copyright (C) 2024 ozeias
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tecnicasdeprogramacao;

/**
 *
 * @author ozeias
 * @date 03/03/2024
 * @brief Class Exercicio07
 */

/*
7 - Faça um programa que defina duas variáveis inteiras (a e b) e que solicite ao 
usuário os valores delas. Utilizando a estrutura condicional if-else, imprima os 
dois valores atribuídos e o maior valor digitado. Exemplo:
Valor de A: 10
Valor de B: 20
Maior: 20
 */
public class Exercicio07 {

    public static void main(String[] args) {

        int a, b; //Declara variáveis do tipo ineteiras

        System.out.println("Digite o primeiro valor: "); //Mensagem apresentada na tela para o uusário
        a = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma váriavel

        System.out.println("Digite o segundo valor: "); //Mensagem apresentada na tela para o uusário
        b = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma váriavel

        System.out.println("Valor de A: " + a); //Imprime na tela o valor de A
        System.out.println("Valor de B: " + b);//Imprime na tela o valor de B

        if (a > b) { //Estrutura condicional 
            System.out.println("Maior: " + a); //Imprime na tela o maior valor
        } else if (b > a) { //Estrutura condicional
            System.out.println("Maior: " + b); //Imprime na telo o menor valor
        } else { //Estrutura condicional caso as anterioes sejam falsas
            System.out.println("Os números são iguais"); //Imprime na tela a mensagem entre aspas
        }

    }

}
