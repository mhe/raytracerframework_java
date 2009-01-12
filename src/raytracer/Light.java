
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

/**
 *
 * @author maarten
 */
public class Light {
    public Point3d position;
    public Color3f color;
    public Light(Point3d position,Color3f color) {
        this.position = position;
        this.color = color;
    }
}
