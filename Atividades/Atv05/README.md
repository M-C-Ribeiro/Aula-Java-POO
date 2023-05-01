# Ativade 05
- O código a seguir, recebe três valores referentes aos gastos, calcula o gasto total, a média mensal e exibe as informações.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código

```
import java.util.Scanner;

public class Atv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // criando objeto scanner
		
		float gastosJaneiro = (float) 30000; // inicializando variável
		float gastosFevereiro = (float) 33030.77; // inicializando variável
		float gastosMarco = (float) 23899.01; // inicializando variável
		
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // inicializando variável com a soma dos gastos
		System.out.printf("O gasto total do trimestre foi: R$%.2f", gastosTrimestre); // mensagem informativa
		
		float mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3; // inicializando variável com o cálculo da média
		System.out.printf("\nValor da média mensal = %,2f", mediaMensal); // mensagem informativa
		
		sc.close(); // encerra objeto scanner

	}
}
```
