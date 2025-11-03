package com.mechim.game.graphics;

import java.util.Random;

public class Screen extends Render{
    private Render test;
    private int testSizeX = 256, testSizeY = 256;
    public Screen(int width, int height){
        super(width, height);
        Random random = new Random();
        test = new Render(testSizeX, testSizeY);
        for (int i = 0; i < testSizeX * testSizeY; i++){
            test.pixels[i] = random.nextInt();
        }
    }

    public void render(){
        for (int i = 0; i < width * height; i++){
            pixels[i] = 0;
        }

        for (int i = 0; i < 100; i++){
            int anim = (int)((Math.sin((System.currentTimeMillis() + i)%1000.0/1000*Math.PI*2)) * 100);
            int anim2 = (int)((Math.cos((System.currentTimeMillis() + i)%1000.0/1000*Math.PI*2)) * 100);

            draw(test, (width-testSizeX)/2 + anim, (height-testSizeY)/2 + anim2);
        }

    }
}
