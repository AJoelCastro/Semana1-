/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * FlatButton es una extensión personalizada de JButton con estilo visual plano.
 * Este botón tiene esquinas redondeadas, un fondo azul oscuro, y texto blanco.
 * Además, se desactivan varios efectos visuales predeterminados.
 */
public class FlatButton extends JButton {
/**
     * Constructor que inicializa el botón
     * y aplica configuraciones visuales para crear un estilo plano.
     */
    public FlatButton(String text) {
        super(text);
        setOpaque(false); // Permite que el fondo personalizado se dibuje correctamente
        setContentAreaFilled(false); // Evita que el área de contenido se pinte automáticamente
        setFocusPainted(false); // Elimina el efecto visual de enfoque
        setBorderPainted(false); // Elimina el borde visual predeterminado
        setForeground(Color.WHITE); // Establece el color del texto a blanco
    }
/**
     * Dibuja el componente con un fondo redondeado de color azul oscuro.
     * También habilita suavizado de bordes para una mejor apariencia visual.
     */
    @Override
    protected void paintComponent(Graphics g) {
        // Se crea una copia del objeto Graphics2D para personalizar el renderizado
        Graphics2D g2 = (Graphics2D) g.create();
        
        // Habilita el suavizado de bordes (antialiasing) para gráficos más suaves
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Establece el color de fondo personalizado
        g2.setColor(new Color(11, 55, 110));
        
        // Dibuja un rectángulo redondeado que cubre todo el componente
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        
        // Libera los recursos del objeto Graphics2D
        g2.dispose();
        
        // Llama al método original para pintar el contenido del botón
        super.paintComponent(g);
    }
}
