# Ativade 03
- O código a seguir, recebe dois valores e calcula a média entre eles, mostrando por meio da biblioteca JOptionPane.

## Aluno
- Mateus Costa Ribeiro
<hr>

## Código
```
import javax.swing.JOptionPane; // importando a biblioteca 

public class Atv03 {
	public static void main(String args []) {

		String aux;
		float nota1, nota2, media;
		try {
			aux = JOptionPane.showInputDialog("Nota da primeira prova: "); // recebe a resposta em formato string
			nota1 = Float.parseFloat(aux); // converte para um float
			aux = JOptionPane.showInputDialog("Nota da segunda prova: "); // recebe a resposta em formato string
			nota2 = Float.parseFloat(aux); // converte para um float

			media = (nota1 + nota2)/ 2; // atribuição do cálculo

			JOptionPane.showMessageDialog(null, "Média final é: " + media); // mensagem informativa
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro na entrada de dados" +  e.toString());
		}
	}
}
```
