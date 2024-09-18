package me.minignomer.miniparticleapi.particles.shapes;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
	public static List<Location> create(Location location1, Location location2, int points, boolean fill) {
        List<Location> locations = new ArrayList<>();
        double x1 = location1.getX();
        double z1 = location1.getZ();
        double x2 = location2.getX();
        double z2 = location2.getZ();
        if (!fill) {
            int amountX = 0;
            int amountZ = 0;
            double distanceX = x2 - x1);
            double distanceZ = z2 - z1);
            double increaseAmountX = 0;
            double increaseAmountZ = 0;
            for (int i = 0; i < points; i++) {
                increaseAmountX += distanceX / points;
                increaseAmountZ += distanceZ / points;
                locations.add(location1.clone().setX(location1.getX() + increaseAmountX));
                locations.add(location2.clone().setX(location2.getX() - increaseAmountX));
                
                locations.add(location1.clone().setZ(location2.getZ() - increaseAmountZ));
                locations.add(location2.clone().setZ(location2.getZ() + increaseAmountZ));
                amountX += ;
            }

            
            // for (int i = 0; i < points; i++) {
            //     x1 += x2 / points;
            //     z1 += z2 / points;
            //     locations.add(location1.clone().setX(x1));
            //     locations.add(location1.clone().setZ(z1));
            //     x2 -= x2 / points;
            //     z2 -= z2 / points;
            //     locations.add(location1.clone().setX(x2));
            //     locations.add(location1.clone().setZ(z2));
            // }
            return locations;
        }
    }
}
