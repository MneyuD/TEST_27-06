package controller;

import view.MouseExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseExampleController implements MouseListener, MouseMotionListener {
    private MouseExampleView mev;

    public MouseExampleController(MouseExampleView mev) {
        this.mev = mev;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        this.mev.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mev.enter();
        int x = e.getX();
        int y = e.getY();
        this.mev.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mev.exit();

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mev.update(x,y);
    }
}
