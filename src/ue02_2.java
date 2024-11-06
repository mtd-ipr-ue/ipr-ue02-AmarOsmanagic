import libraries.Out;
import libraries.In;

public class ue02_2 {
        public static void main(String[] args) {
            Out.print("Jahr: ");
            int year = In.readInt();
    
            Out.print("Monat (1-12): ");
            int month = In.readInt();
    
            int days = 0;   //wird überschrieben
    
            boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
            switch(month){
                case 1,3,5,7,8,10,12:
                    days  = 31;
                    break;
                case 4,6,9,11:
                    days = 30;
                    break;
                case 2:
                    if(leap){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
                default:
                    Out.print("Invalid month. Please enter an existing month.");
                    return;
            }
            Out.print("The month "+month+" in year: "+year+" has "+days+" days");
        }
    }
