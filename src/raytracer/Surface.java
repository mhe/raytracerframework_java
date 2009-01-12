/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raytracer;

/**
 *
 * @author maarten
 */
public abstract class Surface {
    public Material material;
    abstract Hit intersect(Ray r);
}
