# Ativade 01
- O código a seguir, recebe dois inteiro e realiza o cálculo de exemplo de uma folha de pagamento.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código

import java.util.*; // importando biblioteca

public class Atv02 {
	public static void main(String[] args) {
        System.out.println("Informe um inteiro: "); // mensagem informativa

        Scanner sc = new Scanner(System.in); // criando objeto scanner

        int b = sc.nextInt(); // inicializando variável
        int c = sc.nextInt(); // inicializando variável

        int a = b * c; // atribuindo o produto de b e c, para a variável 
		
		System.out.println(b +" x "+ c +" = "+ a);
		System.out.println("Programa de exemplo de folha de pagamento");
	}
}
