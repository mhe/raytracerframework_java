/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

import java.util.Vector;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

/**
 *
 * @author maarten
 */
public class Scene {
        Point3d eye;
        Vector<Surface> surfaces;
        Vector<Light> lights;
        public Scene() {
            surfaces = new Vector<Surface>();
            lights = new Vector<Light>();
        }

        public Color3f trace(Ray r)
        {
            // Initialization of closest hit
            Hit closestHit = new Hit(Double.POSITIVE_INFINITY);

            // find the closest hit
            for(Surface s: surfaces) {
                Hit hit = s.intersect(r);
                if (hit.t < closestHit.t) {
                    closestHit = hit;
                }
            }

            if (closestHit.t < Double.POSITIVE_INFINITY) {
                // no hit, return background color
                return new Color3f(0.0f,0.0f,0.0f);
            }

            // Illumination calculation goes here ...
            // For now, just return the material color.

            return closestHit.surface.material.color;
        }

        public Image render()
        {
            // TODO: to implement
            return null;
        }

        public void addSurface(Surface surface)
        {
            surfaces.add(surface);
        }

        public void addLight(Light light)
        {
            lights.add(light);
        }

        public void setEye(Point3d eye)
        {
            this.eye = eye;
        }
}
