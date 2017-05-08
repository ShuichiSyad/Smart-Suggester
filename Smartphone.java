
package SmartSuggester;

public class Smartphone {
    String name,brand;
    int ram,camera;
    
    Smartphone(String name,String brand,int ram,int camera){
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.camera = camera;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public int getRam(){
        return this.ram;
    }
    
    public int getCamera(){
        return this.camera;
    }
}
