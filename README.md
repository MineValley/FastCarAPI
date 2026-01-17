# FastCarAPI

A comprehensive vehicle management API for Minecraft servers using PaperMC. FastCarAPI provides a robust framework for creating, managing, and interacting with various types of vehicles in the Minecraft world.

## Features

### Vehicle Types
- **Cars** - Combustion and electric vehicles
- **Motorcycles** - Powered two-wheelers
- **Scooters** - Combustion and electric scooters
- **Bicycles** - Standard and electric (pedelec) bicycles
- **Helicopters** - Aircraft with vertical takeoff capabilities

### Core Features
- **Unique Identification** - Each vehicle has a unique license plate
- **Customizable Models** - Support for custom vehicle designs with materials and custom model data
- **Color System** - Full vehicle color customization
- **Physics Engine** - Realistic vehicle physics including:
  - Air resistance
  - Mass and weight
  - Brake force
  - Grip and traction
- **Power Systems**
  - Combustion engines (refuelable)
  - Electric motors (rechargeable)
- **Storage Capabilities** - Vehicles can have storage compartments
- **Tire Management** - Durability tracking for tires
- **Event System** - Vehicle spawn, vanish, and penalty events
- **Parking & Garages** - Garage system with parking tickets
- **Administration** - Penalty and fine management
- **Component System** - Support for seats, addons, and attachments with custom positioning

## Requirements

- **Java 21** or higher
- **PaperMC 1.21.3** or compatible version
- **MineValley CoreAPI 1.300.2** or higher

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

## Usage

FastCarAPI uses a provider pattern for accessing the API functionality. The API is designed to be implemented by a FastCar plugin, and then accessed through the API interfaces.

### Accessing Vehicles

Vehicles are accessed through their interfaces, which provide methods for:
- Getting and changing vehicle properties (color, owner, model)
- Accessing physics objects for world interaction
- Managing vehicle state (spawned, parked, etc.)

### Vehicle Hierarchy

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

### Models and Manufacturing

Each vehicle type has a corresponding model interface that defines:
- Available colors
- Physical dimensions and properties
- Tire specifications
- Seat and component configurations
- Custom model data for rendering

## Events

The API provides events for tracking vehicle lifecycle:
- `VehicleSpawnEvent` - When a vehicle spawns in the world
- `VehicleVanishEvent` - When a vehicle despawns
- `PenaltyIssuedEvent` - When a penalty is issued to a vehicle owner

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Project Information

- **Group ID**: `minevalley.fastcar`
- **Artifact ID**: `api`
- **Version**: `0.1.6`
- **Packaging**: JAR

## Dependencies

- **MineValley CoreAPI** - Core functionality and user management
- **PaperMC** - Minecraft server API
- **Lombok** - Code generation
- **Gson** - JSON serialization

## Contributing

This is part of the MineValley project. For issues, feature requests, or contributions, please refer to the project's issue tracker.

## Related Projects

- [MineValley CoreAPI](https://github.com/MineValley/CoreAPI) - Required dependency providing core functionality
