package com.khamiakou;

/**
 * Task 3. Describe geometric cone.
 */
import java.io.Serializable;

public class Cone implements Serializable {
    private static final long   serialVersionUID = 1L;
    private static final double PI               = Math.PI;
    /*
     * Fields
     */
    // cone's hight
    private int                 hight;
    // the base radius of the cone
    private int                 radius;

    /**
     * Simple constructor
     *
     * @param hight
     *            - cone's hight
     * @param radius
     *            - the base radius
     */
    public Cone(final int hight, final int radius) {
        this.hight = hight;
        this.radius = radius;
    }

    /**
     * @return the hight
     */
    public int getHight() {
        return this.hight;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * @param hight
     *            the hight to set
     */
    public void setHight(final int hight) {
        this.hight = hight;
    }

    /**
     * @param radius
     *            the radius to set
     */
    public void setRadius(final int radius) {
        this.radius = radius;
    }

    /**
     * Calculate square of the base
     *
     * @return - square
     */
    public double square() {
        return Cone.PI * Math.pow(this.radius, 2);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Cone [hight=" + this.hight + ", base radius=" + this.radius + ", base square=2"
                + this.square() + "]";
    }

}
