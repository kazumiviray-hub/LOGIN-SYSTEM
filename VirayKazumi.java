/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viraykazumi;

import java.util.Scanner;

/**
 *
 * @author kazum
 */
public class VirayKazumi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        final int GON_USERS = 10;
        String [][] users = new String [GON_USERS][2];
        int userCount = 0;
        boolean menu= true;
        
        while(menu) {
            System.out.println("===== LOGIN SYSTEM =====");
            System.out.println("[1] Login");
            System.out.println("[2] Register");
            System.out.println("[3] Exit");
            System.out.print("Choose an Option: ");
            
            if(sc.hasNextInt ()) {
                int option = sc.nextInt();
                sc.nextLine();
            
            switch(option) {
                case 1:
                    //LOGIN
                    if (userCount== 0) {
                       System.out.println("User not Registered.Please create a new account. Thank you!");
                       break ;
                    }
                    
                    System.out.println("\n====LOGIN====");
                    System.out.print("USERNAME: ");
                    String username = sc.nextLine();
                    System.out.print("PASSWORD: ");
                    String password = sc.nextLine();
                    
                    boolean loginConfirm = false;
                    
                      for (int i = 0; i < userCount; i++){
                          String storedUsername = users [i][0];
                          String storedPassword = users [i][1];
                          
                          if (username.equals (storedUsername) && password.equals(storedPassword)){
                              System.out.println("Hello, " + username + "!");
                              loginConfirm = true;
                              break;
                           }  
                       }
                       if(!loginConfirm) {
                           System.out.println("Wrong username or password.");
                       }
                       break;
                       
                case 2:
                    // REGISTER
                    if (userCount >= GON_USERS) {
                        System.out.println("Unable to Register. Maximum number of users exceed");
                        return;
                    }
                    
                    System.out.println("\n==== REGISTRATION ====");
                    System.out.print("Enter your Username:");
                    String registeredUsername = sc.nextLine();
                    
                    boolean accountTaken = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users [i][0]. equals(registeredUsername)) {
                            accountTaken = true;
                            break;    
                        }
                    }
                    
                    if (accountTaken){
                        System.out.println("Registration failed.  Username "  + registeredUsername +  " already exist.");
                        break;     
                    }
                    System.out.print("Enter your password: ");
                    String registeredPassword = sc.nextLine ();
                    System.out.print("Confirm password: ");
                    String confirmPassword = sc.nextLine ();
                    
                    if (!registeredPassword.equals(confirmPassword)){
                        System.out.println("Registration failed. Password do not match.");
                        break;
                    }
                     
                    
                    users[userCount][0] = registeredUsername;
                    users[userCount][1] = registeredPassword;
                    userCount++;
                    
                    System.out.println("Well done! Account successfully Registered.");
                    
                    break;
                case 3:
                    //EXIT
                    System.out.println("Thank you for Registering.Goodbye!");
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose between  1, 2, or 3 only.");
                    break;
   
            }    
        } else {
                System.out.println("Invalid input. Please enter a number only.");
                sc.nextLine ();          
            }
            System.out.println();
    }
    sc.close();
    }
    
}
