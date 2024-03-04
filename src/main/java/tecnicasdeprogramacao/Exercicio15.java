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
 * @brief Class Exercicio15
 */

/*
15. Faça um programa em Java que leia dos dados de uma matriz quadrada e imprima 
a diagonal principal da matriz. Utilize a declaração convencional.
 */
public class Exercicio15 {

    public static void main(String[] args) {

        int tamanhoMatriz; //Declara variável do tipo inteira

        System.out.print("Informe o tamanho da matriz quadrada:"); //Mensagem na tela apresentada ao usuário
        tamanhoMatriz = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado em uma variável

        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz]; //Nova matriz 

        System.out.print("Digite os elementos da matriz: "); //Mensagem na tela apresentada ao usuário
        for (int i = 0; i < tamanhoMatriz; i++) { //Se i for maior que 0 e menor que tamanhoMatriz, incrementar + 1 a i
            for (int j = 0; j < tamanhoMatriz; j++) { //Se j for maior que 0 e menor que tamanhoMatriz, incrementar + 1
                System.out.println("Matriz [" + i + 1 + "][" + (j + 1) + "]: "); //Mensagem na tela apresentada ao usuário
                matriz[i][j] = new java.util.Scanner(System.in).nextInt(); //Libera o teclado para o usuário digitar e armazenar o valor digitado na matriz

            }
        }
        System.out.println("Diagonal principal: "); //Imprime o valor da diagonal principal
        for (int i = 0; i < tamanhoMatriz; i++) { //Se i for maior que 0 e menor que o tamanhoMatriz, incrementar i + 1
            System.out.println(matriz[i][i] + " "); //Imprime na tela a matriz

        }
    }
}
