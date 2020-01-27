package demoexception;

public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            double digit = Double.parseDouble(args[0]);
            
            if(digit < 0) throw new Exception("digit cannot be negative");

            System.out.println("digit is " + digit);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("missing command-line arguments");
        } catch(NumberFormatException e){
            System.out.println("command-line must be a number");
        } 
        catch (Exception e) {
            System.out.println("e.getMessage() is "+e.getMessage());
            System.out.println("e is: "+ e);
        } finally {
            System.out.println("This Program Segment has ended");
        }
        
    }
}
