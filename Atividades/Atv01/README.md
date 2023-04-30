# Ativade 01
- O código a seguir, recebe em um laço de repetição While, números para uma somatória, parando caso seja digitado 0, ou um valor não numério.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código
```
import java.util.*; // importando biblioteca

public class Atv01 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in); // criando objeto scanner

        double soma = 0; // inicializando variável
        double valor = 1; // inicializando variável

        System.out.println("Digite valores para a soma: "); // mensagem de aviso
        System.out.println("Valor de parada é 0"); // mensagem de aviso

        while (valor != 0) {
            try {
                valor = sc.nextDouble(); // recebe valor
                soma += valor; // somando valor ao somatório
            } catch (java.util.InputMismatchException e) { // erro de entrada do scanner
                break; // interrompendo a execução caso gere erro, sem apresentar mensagem
            }
        } 

        System.out.println("Somatório é: " + soma); // exibe o valor
        sc.close(); // encerra o objeto scanner
    }
}
```
