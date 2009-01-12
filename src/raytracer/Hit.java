/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import javax.vecmath.Vector3d;

/**
 *
 * @author maarten
 */
public class Hit {
    public double t;
    public Vector3d N;
    public Surface surface;
    public Hit(double t) {
        this.t = t;
    }
}
