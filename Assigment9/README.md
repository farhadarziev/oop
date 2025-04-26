# 3D Shape Calculator

This program demonstrates the concept of **abstraction** and **polymorphism** in Java using an abstract base class for 3D shapes. It creates different shape objects (Sphere, Cylinder, Cube), calculates their surface areas and volumes, and displays the results.


## Features

- Abstract base class `Shape3D` to represent a generic 3D shape.
- Subclasses:
  - **Sphere**: Calculates surface area and volume using radius.
  - **Cylinder**: Calculates surface area and volume using radius and height.
  - **Cube**: Calculates surface area and volume using side length.
- Random generation of shape objects with random dimensions.
- Outputs the shape type, surface area, and volume for each object.


## Class Structure

### 1. `Shape3D` (Abstract Class)
- Abstract methods:
  - `surfaceArea()`: Calculates the surface area of the shape.
  - `volume()`: Calculates the volume of the shape.

### 2. `Sphere` (Subclass)
- Properties: `radius`.
- Implements `surfaceArea()` and `volume()` using:
  - Surface Area: \(4\pi r^2\)
  - Volume: \(\frac{4}{3}\pi r^3\)

### 3. `Cylinder` (Subclass)
- Properties: `radius`, `height`.
- Implements `surfaceArea()` and `volume()` using:
  - Surface Area: \(2\pi r (r + h)\)
  - Volume: \(\pi r^2 h\)

### 4. `Cube` (Subclass)
- Property: `side`.
- Implements `surfaceArea()` and `volume()` using:
  - Surface Area: \(6a^2\)
  - Volume: \(a^3\)

## How the Program Works

1. **Random Shape Generation**:
   - Generates a list of 10 random shapes (`Sphere`, `Cylinder`, `Cube`).
   - Random dimensions are assigned:
     - Radius: 1–10
     - Height: 5–20
     - Side length: 1–10

2. **Calculations**:
   - Calls `surfaceArea()` and `volume()` methods polymorphically for each shape.

3. **Output**:
   - Displays the name of the shape, its dimensions, surface area, and volume.


## Example Output


Cylinder (radius: 4.0, height: 15.0)
Surface Area: 478.78
Volume: 753.98

Cube (side: 8.0)
Surface Area: 384.00
Volume: 512.00
