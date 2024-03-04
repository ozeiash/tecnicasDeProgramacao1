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
 * @brief Class Exercicio14
 */

/*
14 - Utilizando as estruturas de repetição de sua preferência, faça um programa 
que calcule a quantidade de números primos compreendidos entre 1 e 1000.
 */
public class Exercicio14 {

    public static void main(String[] args) {

        int primos = 0, primoMax = 1000; //Declara e inicializa variáveis do tipo inteiras
        int[] numeros = new int[primoMax + 1]; //Novo vetor tipo inteiro

        for (int i = 2; i <= primoMax; i++) { //Para valor de i entre 2 e o valor de primoMax, incrementar + 1
            numeros[i] = i; //Vetor i recebe i 
        }
        for (int i = 2; i <= Math.sqrt(primoMax); i++) { //Para i maior que 2 e menor que a raiz quadraqda de primoMax, incrementar + 1
            if (numeros[i] != 0) { //Se o vetor i for diferente de zero
                for (int j = i * i; j <= primoMax; j += i) { //para j=i*i e j menor que primoMax, incrementar j + i
                    numeros[j] = 0; //Vetor j incializa com 0
                }

            }
        }

        for (int i = 2; i <= primoMax; i++) { //Para i maior que 2 e menor igual a primoMax, incrementar i + 1
            if (numeros[i] != 0) { //Se o vetor numeros que recebe i for diferente de zero
                primos++; //Incrementa primos + 1
            }
        }
        System.out.println("A quantidade de números primos entre 1 e 1000 é:" + primos); //Imprime na tela a quantidade números primos obtida
    }
}
