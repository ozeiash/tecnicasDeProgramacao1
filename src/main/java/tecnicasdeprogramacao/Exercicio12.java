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
 * @brief Class Exercicio12
 */

/*
Utilizando a estrutura de repetição de sua preferência, faça um algoritmo que 
calcule o fatorial de um número informado pelo usuário.
 */
public class Exercicio12 {

    public static void main(String[] args) {

        int num, fatorial = 1, i = 1; //Declara e inicializa variáveis do tipo inteiras
        System.out.println("Informe um número que deseja calcular o fatorial: "); //Mensagem na tela apresentada ao usuário
        num = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        if (num < 0) { //Estrura condicional abrangendo valores negativos
            System.out.println("Não é possível calcular o fatorial de número negativo"); //Imprime na tela a mensagem entre as aspas
        } else { //Estrutura condicional caso a anterior seja falsa
            while (i <= num) { //Estrutura condicional enquanto a variável i for menor ou igual a variável num
                fatorial *= i; //Variável fatorial recebe fatorial + i
                i++; //Incrementa a variavel i 1 vez
            }
            System.out.println("O fatorial de " + num + " é " + fatorial); //Imprime na tela o valor fatorial do número digitado
        }
    }

}
