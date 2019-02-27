package Rectangle;

public class Rectangle {
    private float weight;
    private float height;

    public Rectangle(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Rectangle() {
    }

    public float getWeight() {
        return weight;
    }

    public float getArea() {
        return this.weight*this.height;
    }
    public float getPerimeter() {
        return (this.height + this.weight)*2;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public String display() {
        return "Đây là hình chữ nhật : weight = " + this.weight +" height = " +this.height;
    }
}
