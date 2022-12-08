package Estructura;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Codigo Patito
 */
public class Vertice extends javax.swing.JPanel
        implements MouseListener, MouseMotionListener {

    private int pos = -1;

    public Vertice() {
        initComponents();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setVisible(true);
    }

    public void dibuja(Graphics g) {
        Font fuenteV = getFont();
        Font nuevaFuente = new Font("Monospaced", Font.BOLD, 16);
        g.setColor(Color.blue);
        g.drawOval(0, 0, 30, 30);
        g.setColor(Color.black);
        g.setFont(nuevaFuente);
        if (Grafo.c == Grafo.maxN) {
            Grafo.c = 0;
        }
        g.drawString(Grafo.nombreN[Grafo.c], 12, 19);
        g.setFont(fuenteV);
        this.setName(Grafo.nombreN[Grafo.c]);
        pos = Grafo.c;
        Grafo.c++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Point p;
        if (Grafo.L) {
            p = MouseInfo.getPointerInfo().getLocation();
            if (Grafo.eligioP) {
                p = this.getLocation();
                Grafo.x1 = p.x;
                Grafo.y1 = p.y;
                Grafo.eligioP = false;
                Grafo.i = this.pos;
            } else {
                p = this.getLocation();
                Grafo.x2 = p.x;
                Grafo.y2 = p.y;
                Grafo.linea(Grafo.x1, Grafo.y1,
                        Grafo.x2, Grafo.y2);
                Grafo.eligioP = true;
                Grafo.j = this.pos;
                Grafo.MAdyacencia[Grafo.i][Grafo.j] = true;
                Grafo.MAdyacencia[Grafo.j][Grafo.i] = true;
                Grafo.MIncidencia[Grafo.i][Grafo.j] = true;
                Grafo.MIncidencia[Grafo.j][Grafo.i] = true;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
