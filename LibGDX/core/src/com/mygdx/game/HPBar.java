/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Elev
 */
/*public class HPBar extends ApplicationAdapter{
    SpriteBatch batch;
    int i=0;
    Texture texture, texture2;  

    @Override
	public void create () {
		//batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
                
                batch = new SpriteBatch();
                
                initTestObjects();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(texture2, 100, 100, 300, 20);
                batch.draw(texture, 100, 100, i, 20);
                if(i>300)
                {
                    i=0;
                }
                i++;
		batch.end();        
	}
        private void initTestObjects(){
            
            int width = 1;
            int height = 1;
            Pixmap pixmap = createProceduralPixmap(width, height, 0, 1, 0);
            Pixmap pixmap2 = createProceduralPixmap(width, height, 0, 1, 0);
            
            texture = new Texture(pixmap);
            texture2 = new Texture(pixmap2);
        
        }
        
        private Pixmap createProceduralPixmap(int width, int height,int r,int g,int b) {
        Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);

        pixmap.setColor(r, g, b, 1);
        pixmap.fill();
        
        return pixmap;
        }
        
	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
	}
}*/