/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

/**
 *
 * @author Elev
 */
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {

	public static final float SIZE = 1f;
	
	Vector2 	position = new Vector2();
	Rectangle 	bounds = new Rectangle();
	
	public Block(Vector2 pos) {
		this.position = pos;
		this.bounds.width = SIZE;
		this.bounds.height = SIZE;
	}

	public Vector2 getPosition() {
		return position;
	}

	public Rectangle getBounds() {
		return bounds;
	}
}