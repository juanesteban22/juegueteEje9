package principal;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import Juguete.Juguete;

public class Principal {
	public static void main(String []args){
		HashMap<Integer, Juguete>objeto = new HashMap<Integer,Juguete>();
		int menu ;
		do {
			 menu =Integer.parseInt(JOptionPane.showInputDialog(
					"MENU OBJETOS \n"+
					"0.Animal \n"+
					"1.gerente \n"+
					"2.Carro \n"+
					"3.avion \n"+
					"4.barco \n"+
					"5.juguete \n"+
					"6.robot \n"+
					"7.Insecto \n"+
					"8.Perro \n"+
					"9.gato \n"+
					"10.salir \n"+
					"INGRESA TU ULTIMO NUMERO DE CEDULA"));
			
			
				switch (menu) {
				case 5:
					int menuJuguete;
					do {
					    menuJuguete = Integer.parseInt(JOptionPane.showInputDialog(
					        "Ingresa tu opcion \n"+
					        "1. Ingresar Datos del Juguete \n"+
					        "2. Imprimir todos los Jueguetes que hay \n"+
					        "3. Imprimir por individual tu juguete \n"+
					        "4. Salir")); 

					    switch (menuJuguete) {
					        case 1:
					            ingresarDatos(objeto);
					            break;
					        case 2:
					            consultarJuguetes(objeto);
					            break;
					        case 3:
					            consultarJuguete(objeto);
					            break;
					        case 4:
					            JOptionPane.showMessageDialog(null, "Saliendo del menú");
					            break;
					        default:
					            JOptionPane.showMessageDialog(null, "El número ingresado no es válido");
					            break;
					    }
					} while (menuJuguete != 4);
					break;

				default:
					break;
					
			}
		} while (menu != 10);
		
	}
	public static void ingresarDatos(HashMap<Integer, Juguete> objetos) {
		
		String validar;
		do {
			Juguete juguete = new Juguete();
			 juguete.ingresarDatos();
	        objetos.put(juguete.getIdentificacion(), juguete);
	        validar = JOptionPane.showInputDialog("quieres ingresar otro objeto /Si/No");
		} while (validar.equalsIgnoreCase("si"));
	}

	    public static void consultarJuguete(HashMap<Integer, Juguete> objetos) {
	        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del juguete"));
	        Juguete juguete = objetos.get(identificacion);
	        if (juguete != null) {
	            juguete.imprimirDatos();
	        } else {
	            JOptionPane.showMessageDialog(null, "El juguete con ese id no existe. Ingresa el id correcto.");
	        }
	    }

	    public static void consultarJuguetes(HashMap<Integer, Juguete> objetos) {
	        StringBuilder listaJuguetes = new StringBuilder("Lista de juguetes:\n");

	        for (Map.Entry<Integer, Juguete> entry : objetos.entrySet()) {
	            Juguete juguete = entry.getValue();
	            listaJuguetes.append("ID: ").append(entry.getKey()).append("\n")
	                .append("Tipo: ").append(juguete.getTipo()).append("\n")
	                .append("Color: ").append(juguete.getColor()).append("\n")
	                .append("Tamaño: ").append(juguete.getTamaño()).append("\n")
	                .append("Material: ").append(juguete.getMaterial()).append("\n")
	                .append("---------------------\n");
	        }

	        JOptionPane.showMessageDialog(null, listaJuguetes.toString());
	    }

}

