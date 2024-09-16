package me.minignomer.miniparticleapi.particles;

import org.bukkit.Location;
import org.bukkit.Particle;

import java.util.List;
import java.util.Random;

public class ParticleBuilder {

    public static void createShape(Particle particle, List<Location> particleLocations) {
        for (Location loc : particleLocations) {
            loc.getWorld().spawnParticle(particle, loc, 1, 0, 0, 0, 0);
        }
    }

    public static void createShape(Particle particle, List<Location> particleLocations, Object particleOptions) {
        for (Location loc : particleLocations) {
            loc.getWorld().spawnParticle(particle, loc, 1, 0, 0, 0, 0, particleOptions);
        }
    }

    public static void createCloud(Particle particle, Location loc, int amount, double radiusX, double radiusY, double radiusZ) {
        loc.getWorld().spawnParticle(particle, loc, amount, radiusX, radiusY, radiusZ);
    }

    public static void createCloud(Particle particle, Location loc, int amount, double radiusX, double radiusY, double radiusZ, Object particleOptions) {
        loc.getWorld().spawnParticle(particle, loc, amount, radiusX, radiusY, radiusZ, particleOptions);
    }

    public static void createExplosion(List<Particle> particles, Location loc, int particleAmount, double velocitySpeed) {
        for (Particle particle : particles) {
            for (int i = 0; i < particleAmount; i++) {
                double randX = new Random().nextDouble(-velocitySpeed, velocitySpeed);
                double randY = new Random().nextDouble(-velocitySpeed, velocitySpeed);
                double randZ = new Random().nextDouble(-velocitySpeed, velocitySpeed);
                loc.getWorld().spawnParticle
                        (particle, loc, 0, randX, randY, randZ);
            }
        }
    }

    public static void createExplosion(Particle particle, Location loc, int particleAmount, double velocitySpeed) {
        for (int i = 0; i < particleAmount; i++) {
            double randX = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            double randY = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            double randZ = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            loc.getWorld().spawnParticle
                    (particle, loc, 0, randX, randY, randZ);
        }
    }

    public static void createExplosion(Particle particle, Location loc, int particleAmount, double velocitySpeed, Object particleOptions) {
        for (int i = 0; i < particleAmount; i++) {
            double randX = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            double randY = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            double randZ = new Random().nextDouble(-velocitySpeed, velocitySpeed);
            loc.getWorld().spawnParticle
                    (particle, loc, 0, randX, randY, randZ, particleOptions);
        }
    }
}
