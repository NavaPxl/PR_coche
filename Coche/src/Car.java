public class Car {
    //PARA CREAR ESTA CLASE : BOTON R SOBRE SRC
    // NEW
    //JAVA CLASS

    //------------------------------------------------------------------------
    // CUANDO ESCRIBAMOS OBJETOS TENEMOS QUE ESCRIBIR ESTOS 3 COMENTARIOS:
    //___ATRIBUTOS
    //___GETTER,  SETTERS Y CONSTRUCTOR
    //___FUNCIONES
    //------------------------------------------------------------------------

    //ATRIBUTOS

    private String brand;
    private String model;
    private int year;
    private boolean isOn;


    //GETTER, SETTERS Y CONSTRUCTORS
// BOTON R -- GENERATE -- seleccionamos todoo con shift y damos OK


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
// Y AHORA CONSTRUCTORS

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isOn = false;
    }


    //FUNCIONES

    public boolean startEngine() {
        if (this.isOn) {
            System.err.println("El coche ya está encendido my wey");
        } else {
            this.isOn = true;
            System.out.println("Encendiendo" + this.brand + " " + this.model + " " + this.year);

        }
        return this.isOn;
    }

    public boolean stopEngine() {
        if (!this.isOn) {
            System.err.println("El coche ya esta apagado");
        } else {
            this.isOn = false;
            System.out.println("Apagando" + this.brand + " " + this.model + " " + this.year);


        }
        return this.isOn;
    }

//    public boolean checkOut(){
//
//    }
}