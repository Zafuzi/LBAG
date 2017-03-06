package com.zafuzi;

import java.awt.*;

/**
 * Created by zacharyfoutz on 3/5/17.
 */
public abstract class GameObject {

    protected int x, y;
    protected ID id;
    protected int velocityX, velocityY;

    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setId(ID id){
        this.id = id;
    }

    public void setVelocityX(int velocityX){
        this.velocityX = velocityX;
    }

    public void setVelocityY(int velocityY){
        this.velocityY = velocityY;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public ID getId(){
        return id;
    }

    public int getVelocityX(){
        return velocityX;
    }
    public int getVelocityY(){
        return velocityY;
    }
}
