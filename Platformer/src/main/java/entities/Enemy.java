package entities;

import main.Game;
import utils.HelpMethods;

import static utils.Constants.Directions.LEFT;
import static utils.Constants.Directions.RIGHT;
import static utils.Constants.EnemyConstants.*;
import static utils.HelpMethods.*;

public abstract class Enemy extends Entity {
    private int animationIndex, enemyState, enemyType;
    private int animationTick, animationSpeed = 25;
    private boolean firstUpdate = true;
    private boolean inAir = false;
    private float fallSpeed;
    private float gravity = 0.04f * Game.SCALE;
    private float walkSpeed = 0.5f * Game.SCALE;
    private int walkDir = LEFT;

    public Enemy(float x, float y, int width, int height, int enemyType) {
        super(x, y, width, height);
        this.enemyType = enemyType;
        initHitBox(x, y, width, height);
    }

    private void updateAnimationTick() {
        animationTick++;
        if (animationTick >= animationSpeed) {
            animationTick = 0;
            animationIndex++;
            if (animationIndex >= getSpriteAmount(enemyType, enemyState)) {
                animationIndex = 0;
            }
        }
    }

    public void update(int[][] lvlData) {
        updateMove(lvlData);
        updateAnimationTick();
    }

    private void updateMove(int[][] lvlData) {
        if (firstUpdate) {
            if (!isEntityOnFloor(hitBox, lvlData)) {
                inAir = true;
            }
            firstUpdate = false;
        }

        if (inAir) {
            if (canMoveHere(hitBox.x, hitBox.y + fallSpeed, hitBox.width, hitBox.height, lvlData)) {
                hitBox.y += fallSpeed;
                fallSpeed += gravity;
            } else {
                inAir = false;
                hitBox.y = getEntityYPosUnderRoofOrAboveFloor(hitBox, fallSpeed);
            }
        } else {
            switch (enemyState) {
                case IDLE:
                    enemyState = RUNNING;
                    break;
                case RUNNING:
                    float xSpeed = 0;
                    if (walkDir == LEFT) {
                        xSpeed = -walkSpeed;
                    } else {
                        xSpeed = walkSpeed;
                    }

                    if (canMoveHere(hitBox.x + xSpeed, hitBox.y, hitBox.width, hitBox.height, lvlData)) {
                        if (isFloor(hitBox, xSpeed, lvlData)) {
                            hitBox.x += xSpeed;
                            return;
                        }
                    }

                    changeWalkDir();
                    break;
            }
        }
    }

    private void changeWalkDir() {
        if (walkDir == LEFT) {
            walkDir = RIGHT;
        } else {
            walkDir = LEFT;
        }
    }

    public int getAnimationIndex() {
        return animationIndex;
    }

    public int getEnemyState() {
        return enemyState;
    }
}
