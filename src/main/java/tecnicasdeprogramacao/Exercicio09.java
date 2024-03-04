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
 * @brief Class Exercicio09
 */

/*
9 - Faça um programa que solicite ao usuário o tamanho dos lados de um triângulo. 
O programa deverá imprimir a classificação do triângulo quanto aos lados 
(equilátero, isósceles ou escaleno).
 */
public class Exercicio09 {

    public static void main(String[] args) {

        int lado1, lado2, lado3; //Declara variáveis do tipo inteiras

        System.out.print("Digite a medida do primeiro lado do triangulo: "); //Mensagem na tela apresentada ao usuário
        lado1 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        System.out.print("Digite a medida do segundo lado do triangulo: "); //Mensagem na tela apresentada ao usuário
        lado2 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        System.out.print("Digite a medida do terceiro lado do triangulo: "); //Mensagem na tela apresentada ao usuário
        lado3 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        if (lado1 == lado2 && lado2 == lado3) { //Estrutura condicional
        } else if (lado1 == lado2 && lado2 != lado3) { //Estrutura condicional
            System.out.println("O triangulo é equilátero."); //Imprime na tela o tipo do triangulo
        } else if (lado1 == lado2 && lado2 != lado3) { //Estrutura condicional
            System.out.println("O triangulo é isósceles."); //Imprime na tela o tipo do triangulo

        } else { //Estrutura condicional caso as anteriores sejam falsas
            System.out.println("O triangulo é escaleno."); //Imprime na tela o tipo do triangulo
        }

    }
}
