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
 * @brief Class Exercicio11
 */

/*
Utilizando a estrutura de repetição while, faça um programa que imprima, 
em ordem decrescente, os valores contidos entre 1 e 10000.
*/


public class Exercicio11 {
       public static void main(String[] args) {

        int i = 10000; //Declara e inicializa uma váriavel do tipo inteira

        while (i >= 1) { //Laço a ser repetido enquanto a variável i compreender o intervalo 1 até 1000
            System.out.println(i); //Imprime na tela o valor de i
            i--; //Decrementa a variável i em -1
        }

    }

}
