package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
public class Principal {
	public static void main(String[] args) {

		function monedas = new function();
		

		while (true) {

			int opcion = JOptionPane.showOptionDialog(null, "Conversor de divisas", "Menu",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Convertir moneda"}, "Opción única");

			switch (opcion) {
			case JOptionPane.YES_OPTION:
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
		}

	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
