import javax.swing.JOptionPane;

public class SalarioPag {

    public static void main(String[] args) {
        int salario[] = new int[4];
        int reajust = 0;

        for (int i = 0; i < salario.length; i++) {
            salario[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu valor salarial : "));
           
            if (salario[i] <= 860) {
                reajust = (salario[i] * 10) / 100;
                salario[i] = salario[i] + reajust;
                System.out.println("O salario do " + i + " e : " + salario[i]);
            }
            else if (salario[i] > 861) {
                reajust = (salario[i] * 7) / 100;
                salario[i] = salario[i] + reajust;
                System.out.println("O salario do " + i + " e : " + salario[i]);
            }
        }
    }
}
