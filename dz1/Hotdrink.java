package dz1;

public class Hotdrink extends Product {
    private String type;
    private int quantity;
    private float price;
    private int number;
    private int temperature;

    public Hotdrink(String type, int quantity, float price, int number, int temperature) {
        super(type, quantity, price, number);
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.number = number;
        this.temperature = temperature;
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }
    @Override
    public float getPrice() {
        return super.getPrice();
    }
    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
    @Override
    public String getType() {
        return super.getType();
    }
    @Override
    public void setNumber(int number) {
        super.setNumber(number);
    }
    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }
    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }
    @Override
    public void setType(String type) {
        super.setType(type);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + quantity;
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + number;
        result = prime * result + temperature;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hotdrink other = (Hotdrink) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (quantity != other.quantity)
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        if (number != other.number)
            return false;
        if (temperature != other.temperature)
            return false;
        return true;
    }
  }

