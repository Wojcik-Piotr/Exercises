package pl.sdacademy.exercises.homework.Zad18;

import java.util.Scanner;

public class ZipCodeToBarcode {
    private Scanner scanner=new Scanner(System.in);
    private String zipCode;
    private final String LONG="*****\n";
    private final String SHORT="**\n";

    public ZipCodeToBarcode(){
        setZipCode();
        covert();
    }

    private void setZipCode(){
        System.out.print("Enter zipcode: ");
        zipCode=scanner.next();
    }
    private void covert(){
        StringBuilder stringBuilder=new StringBuilder();
        System.out.println("Your barcode for: "+zipCode+" is:");
        stringBuilder.append(LONG);
        for (char c :zipCode.toCharArray()) {
           stringBuilder.append(barcode(c));
        }
        stringBuilder.append(LONG);
        System.out.print(stringBuilder.toString());
    }

    private String barcode(char digit){
        if (digit == '0'){
            return LONG+LONG+SHORT+SHORT+SHORT;
        }
        else if (digit == '1'){
            return SHORT+SHORT+SHORT+LONG+LONG;
        }
        else if (digit == '2'){
            return SHORT+SHORT+LONG+SHORT+LONG;
        }
        else if (digit == '3'){
            return SHORT+SHORT+LONG+LONG+SHORT;
        }
        else if (digit == '4'){
            return SHORT+LONG+SHORT+SHORT+LONG;
        }
        else if (digit == '5'){
            return SHORT+LONG+SHORT+LONG+SHORT;
        }
        else if (digit == '6'){
            return SHORT+LONG+LONG+SHORT+SHORT;
        }
        else if (digit == '7'){
            return LONG+SHORT+SHORT+SHORT+LONG;
        }
        else if (digit  == '8'){
            return LONG+SHORT+SHORT+LONG+SHORT;
        }
        else if (digit == '9'){
            return LONG+SHORT+LONG+SHORT+SHORT;
        }
        else {
            return "Invalid";
        }
    }
}
