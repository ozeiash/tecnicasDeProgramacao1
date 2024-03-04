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
 * @brief Class Exercicio13
 */

/*
13 - Utilizando a estrutura de repetição de sua preferência, faça um programa que 
defina duas variáveis inteiras (x e y) e solicite ao operador os valores. 
O programa deve calcular o valor da expressão xy sem utilizar nenhuma função já 
existente, ou seja, usando apenas operações aritméticas simples, além de 
estruturas de repetição.
*/
public class Exercicio13 {
 public static void main(String[] args) {

        int x, y, resultado = 1; //Declara e inicializa variáveis do tipo inteiras

        System.out.println("Digite o valor de x: "); //Mensagem na tela apresentada ao usuário
        x = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        System.out.println("Digite o valor de y: "); //Mensagem na tela apresentada ao usuário
        y = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        for (int i = 0; i < y; i++) { //para várial vel i maior que 0 e menor que y incrementar + 1
            resultado *= x; //Variável resultado recebe resultado * x

        }
        System.out.println(x + "ˆ" + y + " = " + resultado); ////Imprime na tela o resultado
    }
}
