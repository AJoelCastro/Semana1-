/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.awt.*;
import javax.swing.*;

/**
 * RoundedPanel es una extensión de JPanel que dibuja un panel con bordes redondeados.
 */
public class RoundedPanel extends JPanel {

    // Radio de las esquinas redondeadas (por defecto 25 píxeles)
    private int cornerRadius = 25;

    /**
     * Constructor del RoundedPanel.
     * Establece que el panel no será opaco para poder personalizar su pintura.
     */
    public RoundedPanel() {
        super();
        setOpaque(false); // Permite que se dibuje el fondo manualmente
    }

    /**
     * Método sobrescrito para pintar el componente con bordes redondeados.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Llamar primero al método de la superclase

        Dimension arcs = new Dimension(cornerRadius, cornerRadius); // Define el tamaño del redondeo
        int width = getWidth();   // Ancho actual del panel
        int height = getHeight(); // Alto actual del panel

        Graphics2D graphics = (Graphics2D) g; // Convertir a Graphics2D para más funciones

        // Activar suavizado de bordes (antialiasing)
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar el fondo con esquinas redondeadas
        graphics.setColor(getBackground()); // Usar color de fondo del panel
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        // Dibujar el borde del panel
        graphics.setColor(getForeground()); // Usar color de borde del panel
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
    }

    /**
     * Permite cambiar el radio de las esquinas redondeadas.
     * @param radius Nuevo radio en píxeles
     */
    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint(); // Redibujar el panel con el nuevo radio
    }
}

