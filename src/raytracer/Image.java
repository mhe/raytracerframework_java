/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import javax.vecmath.Color3f;

/**
 *
 * @author maarten
 */
public class Image {
    int width,height;
    Color3f colors[];

    public Image(int width,int height) {
        this.width = width;
        this.height = height;
        colors = new Color3f[width*height];
    }
    
    public Image(String filename) {
        // TODO: to implement
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setPixel(int x, int y, Color3f color) {
        colors[pixelIndex(x,y)] = color;
    }

    public Color3f getPixel(int x, int y) {
        return colors[pixelIndex(x,y)];
    }

    protected int pixelIndex(int x, int y) {
        return y*width + x;
    }

    public void writeToPNG(String filename) {
        // TODO: to implement
    }

}
