package com.zafuzi;

import java.awt.*;
import java.util.Random;

/**
 * Created by zacharyfoutz on 3/5/17.
 */
public class Player extends GameObject{
    public Player(int x, int y, ID id){
        super(x,y,id);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public void tick() {
        x += velocityX;
        y += velocityY;

        x = Game.clamp(x, 0, Game.WIDTH - 32);
        y = Game.clamp(y, 0, Game.HEIGHT - 32);

        velocityX = Game.clamp(velocityX, -5, 5);
        velocityY = Game.clamp(velocityY, -5, 5);
    }

    @Override
    public void render(Graphics g) {
        if(id == ID.Player) g.setColor(Color.WHITE);
        g.fillRect(x,y,32,32);
    }
}
