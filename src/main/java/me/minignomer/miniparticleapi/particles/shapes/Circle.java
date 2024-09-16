package me.minignomer.miniparticleapi.particles.shapes;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class Circle {

    public static List<Location> create(Location loc, int points, double radius) {
        List<Location> locations = new ArrayList<>();

        for (double i = 0; i < Math.PI * 2; i += Math.PI / (points / 2.0)) {
            double x = Math.cos(i) * radius;
            double z = Math.sin(i) * radius;
            locations.add(loc.clone().add(x, 0, z));
        }
        return locations;
    }
}
