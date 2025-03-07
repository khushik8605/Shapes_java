// Sphere.java
class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }

        public double calculatePerimeter() {
        return 0; // No perimeter for a sphere
    }
  
}

