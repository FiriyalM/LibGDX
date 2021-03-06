
package com.mygdx.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
/**
 *
 * @author Elev
 */
public class Player {

    public enum State {
     IDLE, WALKING, JUMPING, DYING
    }
 
        static final float SPEED = 2f; // unit per second
        static final float JUMP_VELOCITY = 1f;
        static final float SIZE = 0.5f; // half a unit
 
        Vector2  position = new Vector2();
        Vector2  acceleration = new Vector2();
        Vector2  velocity = new Vector2();
        Rectangle  bounds = new Rectangle();
        State  state = State.IDLE;
        boolean  facingLeft = true;
        float stateTime = 0;
 
    public Player(Vector2 position) {
        this.position = position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }


	public boolean isFacingLeft() {
		return facingLeft;
	}

	public void setFacingLeft(boolean facingLeft) {
		this.facingLeft = facingLeft;
	}

	public Vector2 getPosition() {
		return position;
	}

	public Vector2 getAcceleration() {
		return acceleration;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public State getState() {
		return state;
	}
	
	public void setState(State newState) {
		this.state = newState;
	}

	public float getStateTime() {
		return stateTime;
	}

	public void update(float delta) {
		stateTime += delta;
		position.add(velocity.tmp().mul(delta)); 
	}
}
	

