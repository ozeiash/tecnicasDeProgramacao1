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
 * @brief Class Exercicio04
 */

/*
4 - Repita o exercício anterior, mas solicite ao usuário os valores para as 
variáveis x, y e z.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        int x, y, z; //Declara variáveis do tipo inteiro

        System.out.print("Digite o primeiro valor: "); //Mensagem a ser apresentada para o usuário
        x = new java.util.Scanner(System.in).nextInt(); // libera o teclado para o usuário digitar

        System.out.print("Digite o segundo valor: "); //Mensagem a ser apresentada para o usuário
        y = new java.util.Scanner(System.in).nextInt(); //libera o teclado para o usuário digitar

        System.out.print("Digite o terceiro valor: "); //Mensagem a ser apresentada para o usuário
        z = new java.util.Scanner(System.in).nextInt(); //libera o teclado para o usuário digitar

        System.out.println(x * y / z); //Imprime na tela o resultado da expressao 
    }
}
