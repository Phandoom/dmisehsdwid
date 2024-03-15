package com.BuriTM;

//Ein Kreis ist eine geometrische Form
public class Kreis extends Form
{
    private double radius;

    public Kreis(int x, int y, double radius)
    {
        super(x, y);
        this.radius = radius;
    }

    public double berechneUmfang()
    {
        System.out.print("berechne Umfang Kreis: ");
        double umfang = 2 * this.radius * Math.PI;
        return umfang;
    }

    public double berechneFlaeche()
    {
        System.out.print("berechne Fläche Kreis: ");
        double fläche = Math.PI * Math.pow(this.radius,2);
        return fläche;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
