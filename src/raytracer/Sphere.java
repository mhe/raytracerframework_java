/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import javax.vecmath.Point3d;

/**
 *
 * @author maarten
 */
public class Sphere extends Surface {
    Point3d position;
    double r;
    public Sphere(Point3d position,double r) {
        this.position = position;
        this.r = r;
    }
    public Hit intersect(Ray r)
    {
        return null;
    }
}
