# FastCarAPI

A comprehensive vehicle management API for Minecraft servers using PaperMC. FastCarAPI provides a robust framework for creating, managing, and interacting with various types of vehicles in the Minecraft world.

## Vehicles

```
Vehicle (base interface)
├── RechargeableVehicle
├── RefuelableVehicle
├── StorageVehicle
├── Car
│   ├── ElectricCar
│   └── CombustionCar
├── Motorcycle
├── ElectricScooter
├── CombustionScooter
├── Bicycle
├── Pedelec
└── Helicopter
```

## Installation

### Maven

Add the MineValley GitHub repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/MineValley/FastCarAPI</url>
    </repository>
</repositories>
```

Add the dependency:

```xml
<dependency>
    <groupId>minevalley.fastcar</groupId>
    <artifactId>api</artifactId>
    <version>0.1.6</version>
</dependency>
```
