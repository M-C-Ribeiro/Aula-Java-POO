# Ativade 06
- O código a seguir, recebe os valores de capital e montante desejados, para calcular a quantidade de meses necessários para atingir o montante.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código

```
import java.util.*; // importação da biblioteca 
import java.lang.Math; // importação da biblioteca

public class Atv06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // criando objeto scanner
	
		try {
			System.out.println("Informe o capital:"); // mensagem informativa
			float capital = sc.nextFloat(); // inicializando a variável 
			System.out.println("Informe o montante desejado:"); // mensagem informativa
			float montante = sc.nextFloat(); // inicializando a variável
			float aux = (float) 1.005; // inicializando a variável
			int tempo = 0; // inicializando a variável
			
			while (true) { // fórmula de juros compostos: montante = capital * (1 + juros) ^ tempo
				if ((capital * Math.pow(aux, tempo))>= montante) { // condição de parada a partir da fórmula de juros compostos
					break; // interrompendo o laço
				}
				tempo++; // incrementando o tempo
			}
			System.out.printf("Para acumular o montante desejado, é necessário %d", tempo); // mensagem informativa
			
		} catch (Exception e) {
			System.out.println("Erro durante execução"); // mensagem informativa
		}
		sc.close(); // encerra objeto scanner
	}
}
```