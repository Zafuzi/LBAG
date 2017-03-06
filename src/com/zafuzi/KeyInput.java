package com.zafuzi;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by zacharyfoutz on 3/5/17.
 */
public class KeyInput extends KeyAdapter{
    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        for(int i = 0; i< handler.objects.size(); i++){
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.getId() == ID.Player){
                if(key == KeyEvent.VK_W) tempObject.setVelocityY(tempObject.getVelocityY() - 5);
                if(key == KeyEvent.VK_S) tempObject.setVelocityY(tempObject.getVelocityY() + 5);
                if(key == KeyEvent.VK_D) tempObject.setVelocityX(tempObject.getVelocityX() + 5);
                if(key == KeyEvent.VK_A) tempObject.setVelocityX(tempObject.getVelocityX() - 5);
            }
        }

        if(key == KeyEvent.VK_ESCAPE) System.exit(0);
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        for(int i = 0; i< handler.objects.size(); i++){
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.getId() == ID.Player){
                if(key == KeyEvent.VK_W) tempObject.setVelocityY(0);
                if(key == KeyEvent.VK_S) tempObject.setVelocityY(0);
                if(key == KeyEvent.VK_D) tempObject.setVelocityX(0);
                if(key == KeyEvent.VK_A) tempObject.setVelocityX(0);
            }
        }
    }

}
