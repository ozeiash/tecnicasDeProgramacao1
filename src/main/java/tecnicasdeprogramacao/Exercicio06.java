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
 * @brief Class Exercicio06
 */

/*
6 - Considere dois pontos no plano cartesiano, o Ponto 1 e o Ponto 2, e suas 
respectivas coordenadas. As coordenadas do Ponto 1 são definidas pelas variáveis 
x1 e y1, e as coordenadas do Ponto 2 são definidas pelas variáveis x2 e y2. Faça 
um programa que calcule a distância euclidiana
(d) entre dois pontos considerando os valores digitados pelo usuário para as 
variáveis x1, y1, x2 e y2. Considere
d = (x1 - x2)2 + (y1 - y2)2. Por exemplo, suponha que o
usuário digitou para o Ponto 1 as coordenadas 2 e 3; além disso, suponha que os 
valores digitados para o Ponto 2 tenham sido 4 e 5. O programa deverá ter a 
seguinte saída:
Ponto 1: (2,3)
Ponto 2: (4,5)
Distância: 8
 */
public class Exercicio06 {

    public static void main(String[] args) {

        int x1, y1, x2, y2, d; //Declara variáveis do tipo inteiras

        System.out.print("Digite o número correspondente a posição x do primeiro ponto: "); //Mensagem apresentada ao usuário
        x1 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado num variável

        System.out.print("Digite o número correspondente a posição y do primeiro ponto: "); //Mensagem apresentada ao usuário
        y1 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado num variável

        System.out.print("Digite o número correspondente a posição x do segundo ponto: "); //Mensagem apresentada ao usuário
        x2 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado num variável

        System.out.print("Digite o número correspondente a posição y do segundo ponto: "); //Mensagem apresentada ao usuário
        y2 = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado num variável

        d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2); //Expressão matemática a ser executada pelo sistema

        System.out.println("Ponto 1: " + "(" + x1 + "," + y1 + ")"); //Imprime na tela o ponto 1
        System.out.println("Ponto 2: " + "(" + x2 + "," + y2 + ")"); //Imprime na tela o ponto 2
        System.out.println("Distância: " + d); //Imprime na tela a distância percorrida

    }

}
