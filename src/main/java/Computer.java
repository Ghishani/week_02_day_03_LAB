public class Computer {

    // Computer Properties
    int storage;
    String printerModel;


    // Constructor

    public Computer(int inputStorage){
        this.storage = inputStorage;
        this.printerModel = null;
    }

    //getter
    //public String getName(){
//        return this.name;

    public int currentStorage(){
        return this.storage;
    }

    public void setStorage(int addStorage){
        this.storage += addStorage;
    }

    public void setPrinterModel(String printerModel2){

        this.printerModel = printerModel2;
    }

    public void printMessage(String message){

        if (this.printerModel != null){
            System.out.println(message);
        }
    }



}
