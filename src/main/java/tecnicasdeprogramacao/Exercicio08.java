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
 * @brief Class Exercicio08
 */

/*
8 - Repita o exercício anterior, mas crie uma variável com o nome maior. Utilizando 
o operador ternário, atribua o maior valor à variável maior e apresente na tela 
em seguida da mesma forma que foi exemplificado anteriormente.
 */
public class Exercicio08 {

    public static void main(String[] args) {

        int a, b, maior; //Declara variáveis do tipo inteiras

        System.out.println("Digite o primeiro valor: "); //Mensagem na tela apresentada ao usuário
        a = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        System.out.println("Digite o segundo valor: "); //Mensagem na tela apresentada ao usuário
        b = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        System.out.println("Valor de A: " + a); //Imprime o valor de A
        System.out.println("Valor de B: " + b); //Imprime o valor de B

        maior = (a > b ? a : b); //Executa e armazena a expressão matemática em uma variável

        System.out.println("Maior: " + maior); //Imprime na tela o Maior valor

    }

}
