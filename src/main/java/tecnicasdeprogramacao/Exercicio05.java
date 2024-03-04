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
 * @brief Class Exercicio05
 */

/*
5 - Faça um programa que calcule a distância em quilômetros (km) percorrida por um 
carro. Solicite ao usuário a velocidade em quilômetros por hora (km/h) e o tempo 
da viagem em horas. O programa deve apresentar a velocidade e o tempo informados 
pelo usuário, bem como a distância calculada. Exemplo:
Velocidade: 100km/h
Tempo da viagem: 3 horas
Distancia percorrida: 300 km
 */
public class Exercicio05 {

    public static void main(String[] args) {

        int velocidade, horas, distancia; //Declara variáveis do tipo inteira

        System.out.println("Digite a velocidade em km/h: "); //Menssagem exibida na tela para o usuário
        velocidade = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado em uma variável

        System.out.println("Digite o tempo de duração da viagem em horas:"); //Menssagem exibida na tela para o usuário
        horas = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazena o valor digitado em uma variável

        distancia = velocidade * horas; //Expressão matemática a ser executada

        System.out.println("Velocidade: " + velocidade + " km/h"); //Imprime na tela a velocidade
        System.out.println("Tempo da viagem: " + horas + " horas."); //Imprime na tela o tempo da viagem
        System.out.println("Distância percorrida: " + distancia + " km"); //Imprime na tela a distancia percorrida

    }
}
