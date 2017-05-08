
package SmartSuggester;
import java.util.ArrayList;
import java.util.Scanner;
public class SmartSuggester {

    public static void main(String[] args) {
        ArrayList list_smartphones = new ArrayList();
        
        String[] brand = {"Asus","Apple","Asus","Apple","Motorola"};
        String[] name = {"Zenfone 2","iPhone 6S","Zenfone 5","iPhone SE","Moto G"};
        int[] ram = {4,2,3,1,4};
        int[] camera = {13,8,12,5,12};
        
        for(int i = 0; i < brand.length; i++){
            Smartphone smart = new Smartphone(name[i],brand[i],ram[i],camera[i]);
            list_smartphones.add(smart);
        }
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your prefered RAM size : ");
        int minimum_ram = kb.nextInt(); //input by user
        System.out.print("Please enter your preferred camera : ");
        int minimum_camera = kb.nextInt();
        
        ArrayList filteredRam = new ArrayList();
        for(Object checkRam:list_smartphones){
            if(((Smartphone)checkRam).getRam()>=minimum_ram){   //check if the ram is atleast the user input
                filteredRam.add(checkRam);  //add the phone to another list
            }
        }
        
        ArrayList filteredCamera = new ArrayList();
        for(Object checkCamera:filteredRam){
            if(((Smartphone)checkCamera).getCamera()>=minimum_camera){   //check if the ram is atleast the user input
                filteredCamera.add(checkCamera);  //add the phone to another list
            }
        }
        
        System.out.println("List For you: ");
        for(Object print:filteredCamera){
            System.out.println("Phone : "+((Smartphone)print).getBrand() + " " + ((Smartphone)print).getName());
            System.out.println("Ram : "+((Smartphone)print).getRam()+"GB");
            System.out.println("Camera : "+((Smartphone)print).getCamera()+"MP");
            System.out.println("\n-----------\n");
        }
    }
    
}
