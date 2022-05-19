package com.syntax;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SolarSystem s = new SolarSystem();
        s.sun = "1";
        s.planet = "9";


        //adding feature to sun
        FeatureSun f = new FeatureSun();
        f.heat = "123kj";
        f.color = "red";

        //adding features to star
        FeatureStars star = new FeatureStars();
        star.color = "yellow";
        star.size = "123123km";

        //adding features to planet1
        Planet1Features p1 = new Planet1Features();
        p1.color="black";
        p1.planet="1";
    }
}
