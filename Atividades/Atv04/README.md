# Ativade 03
- O código a seguir, recebe três valores referentes aos gastos, calcula o gasto toal e exibe a informação.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código

```
import java.util.*;

public class Atv04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // criando objeto scanner
		
		System.out.println("Informe o gasto de Janeiro:");
		float gastosJaneiro = sc.nextFloat(); // inicializando variável
		System.out.println("Informe o gasto de Fevereiro:");
		float gastosFevereiro = sc.nextFloat(); // inicializando variável
		System.out.println("Informe o gasto de Março:");
		float gastosMarco = sc.nextFloat(); // inicializando variável
		
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // inicializando variável com a soma dos gastos
		
		System.out.printf("O gasto total do trimestre foi: R$%.2f", gastosTrimestre); // mensagem informativa
		
		sc.close(); // encerra objeto scanner
	}
}
```