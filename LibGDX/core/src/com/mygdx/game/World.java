
package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
/**
 *
 * @author Elev
 */ 
public class World {
 
 /** The blocks making up the world **/
 Array<Block> blocks = new Array<Block>();
 /** Our player controlled hero **/
 Player player;
 
 // Getters -----------
    public Array<Block> getBlocks() {
         return blocks;
    }
     public Player getPlayer() {
         return player;
     }
 // --------------------
 
    public World() {
        createDemoWorld();
    }
 
    private void createDemoWorld() {
    player = new Player(new Vector2(7, 2));
 
        for (int i = 0; i < 10; i++) {
        blocks.add(new Block(new Vector2(i, 0)));
        blocks.add(new Block(new Vector2(i, 7)));
        if (i > 2)
        blocks.add(new Block(new Vector2(i, 1)));
    }
        blocks.add(new Block(new Vector2(9, 2)));
        blocks.add(new Block(new Vector2(9, 3)));
        blocks.add(new Block(new Vector2(9, 4)));
        blocks.add(new Block(new Vector2(9, 5)));
 
        blocks.add(new Block(new Vector2(6, 3)));
        blocks.add(new Block(new Vector2(6, 4)));
        blocks.add(new Block(new Vector2(6, 5)));
    }
}
