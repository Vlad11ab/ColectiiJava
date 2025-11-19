package app.car.model;

public class Car implements Comparable<Car>{
    private int id;
    private int userId;
    private String model;
    private String culoare;
    private int anFabricatie;
    private int price;

    public Car(int id, int userId, String model, String culoare, int anFabricatie, int price){
        this.id = id;
        this.userId = userId;
        this.model = model;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.price = price;
    }

    public Car(String text) {
        String [] tokens = text.split(",");
        this.id = Integer.parseInt(tokens[0]);
        this.userId = Integer.parseInt(tokens[1]);
        this.model = tokens[2];
        this.culoare = tokens[3];
        this.anFabricatie = Integer.parseInt(tokens[4]);
        this.price =  Integer.parseInt(tokens[5]);
    }


    private Car(Builder builder){
        this.id = builder.id;
        this.userId = builder.userId;
        this.model = builder.model;
        this.culoare = builder.culoare;
        this.anFabricatie = builder.anFabricatie;
        this.price = builder.price;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private int userId;
        private String model;
        private String culoare;
        private int anFabricatie;
        private int price;

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder userId(int userId){
            this.userId = userId;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder culoare(String culoare){
            this.culoare = culoare;
            return this;
        }

        public Builder anFabricatie(int anFabricatie){
            this.anFabricatie = anFabricatie;
            return this;
        }

        public Builder price(int price){
            this.price = price;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    public void setAnFabricatie(int anFabricatie){
        this.anFabricatie = anFabricatie;
    }
    public void setPrice(int price){
        this.price = price;
    }
    //Getters
    public int getId(){
        return id;
    }
    public int getUserId() {
        return userId;
    }
    public String getModel(){
        return model;
    }
    public String getCuloare(){
        return culoare;
    }
    public int getAnFabricatie(){
        return anFabricatie;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "id: " + this.id + "userId: " + this.userId + "model: " + this.model + "culoare: " + this.culoare + "anFabricatie: " + this.anFabricatie + "price: " + this.price;
    }

    @Override
    public boolean equals(Object o){
        if( o == null ){
            return false;
        }
        Car other=(Car) o;
        return this.model.equals(other.model);


    }

    @Override
    public int compareTo(Car o) {
        if (o.anFabricatie < this.anFabricatie) {
            return  1;
        } else if (o.anFabricatie > this.anFabricatie) {
            return -1;
        }
        return 0;
    }

}