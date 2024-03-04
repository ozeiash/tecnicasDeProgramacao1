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
 * @brief Class Exercicio10
 */

/*
10. Utilizando a estrutura de repetição for, faça um programa que imprima, em 
ordem crescente, os valores contidos entre 1 e 10000.
 */
public class Exercicio10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) { //Repete o comando e incrementa mais um até o resultado ser falso
            System.out.println(i); // Imprime na tela os valores atribuidos a variável i
        }

    }
}
