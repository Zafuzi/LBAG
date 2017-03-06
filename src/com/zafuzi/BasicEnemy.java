package com.zafuzi;

import java.awt.*;
import java.util.Random;

/**
 * Created by zacharyfoutz on 3/6/17.
 */
public class BasicEnemy extends GameObject{
    @Override
    public Rectangle getBounds() {
        return null;
    }

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);
        velocityX = 5;
        velocityY = 5;
    }

    @Override
    public void tick() {
        x += velocityX;
        y += velocityY;

        if(y <= 0 || y >= Game.HEIGHT - 32) velocityY *= -1;
        if(x <= 0 || x >= Game.WIDTH) velocityX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x,y,16,16);
    }
}
