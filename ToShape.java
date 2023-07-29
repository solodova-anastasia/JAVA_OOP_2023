class ToShape {
    double width;
    double height;

    public void showDim() {
        System.out.printf("Ширина %.2f, высота %.2f \n", width, height);
    }
}

class Triangle extends ToShape {

    String style;

    public double area() {
            return height * width / 2;
        }

    public void showStyle() {
        System.out.printf("Треугольник %s", style);
    }
}