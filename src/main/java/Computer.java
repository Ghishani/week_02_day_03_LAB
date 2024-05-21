public class Computer {

    // Computer Properties
    private int storage;
    private String printer;


    // Constructor

    public Computer(int inputStorage){
        this.storage = inputStorage;
        this.printer = "";
    }

    public int getStorage(){
        return this.storage;
    }

    public void setStorage(int extraStorage){
        this.storage += extraStorage;
    }

    public String getPrinter(){
        return this.printer;
    }

    public void setPrinter(String printerName){

        this.printer = printer;
    }

    public void printMessage(String message){

        if (!this.printer.equals("")){
            System.out.println(message);
        }
    }
}
