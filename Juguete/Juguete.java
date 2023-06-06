package Juguete;
import javax.swing.JOptionPane;

public class Juguete {
    private String tipo;
    private String color;
    private double tamaño;
    private String material;
    private int identificacion;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void ingresarDatos() {
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de juguete: ");
        color = JOptionPane.showInputDialog("Ingrese el color de su juguete");
        tamaño = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño de su juguete"));
        material = JOptionPane.showInputDialog("Ingrese el material de su juguete");
        identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de su juguete:"));
    }

    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null,
                "Tipo: " + tipo + "\n" +
                "Color: " + color + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Material: " + material + "\n" +
                "Identificación del juguete: " + identificacion);
    }
}

