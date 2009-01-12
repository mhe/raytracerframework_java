/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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

    protected int[] toIntArray() {
        int [] intArray = new int[width*height];
        for(int i=0;i < width*height;++i) {
            Color3f c = colors[i];
            intArray[i] = (int)(c.x * 255)*256*256+(int)(c.y*255)*256+(int)(c.z*255);
        }
        return intArray;
    }
    public void writeToPNG(String filename) {
        // TODO: to implement
        BufferedImage bImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        bImage.setRGB(0, 0, width, height, toIntArray(), 0, width);
        File f = new File(filename);
        try {
            ImageIO.write(bImage, "png", f);
        } catch (IOException e) {
            System.err.println("Exception: unable to write image to file "+filename);
        }
    }

}
