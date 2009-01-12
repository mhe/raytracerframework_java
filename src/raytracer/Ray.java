/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

/**
 *
 * @author maarten
 */
public class Ray {
    public Point3d origin;
    public Vector3d direction;

    public Ray(Point3d origin,Vector3d direction) {
        this.origin = origin;
        this.direction = direction;
    }
    public Point3d at(double t) {
        Point3d position = new Point3d(origin);
        position.scaleAdd(t, direction);
        return position;
    }
}
