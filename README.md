# FastCarAPI

A comprehensive vehicle management API for Minecraft servers using PaperMC. FastCarAPI provides a robust framework for creating, managing, and interacting with various types of vehicles in the Minecraft world.

## Vehicles

```
Vehicle (base interface)
├── RechargeableVehicle (electric vehicles - mixin)
├── RefuelableVehicle (combustion vehicles - mixin)
├── StorageVehicle (vehicles with storage - mixin)
├── Car (base for cars, extends StorageVehicle)
│   ├── ElectricCar (extends Car, RechargeableVehicle)
│   └── CombustionCar (extends Car, RefuelableVehicle)
├── Motorcycle (extends RefuelableVehicle, StorageVehicle)
├── ElectricScooter (extends RechargeableVehicle, StorageVehicle)
├── CombustionScooter (extends RefuelableVehicle, StorageVehicle)
├── Bicycle
├── Pedelec (extends RechargeableVehicle)
└── Helicopter (extends RefuelableVehicle, StorageVehicle)
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
