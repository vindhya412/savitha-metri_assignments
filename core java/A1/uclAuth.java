import java.util.Hashmap;
import java.util.Scanner;
public Class auth {
  public Static void main (String[] args){
    HashMap<String,Integer>user=new Hashmap<String,Integer>();
    Scanner s= new Scanner (System.in);
    user.put("savithametri",12345);
    user.put("newuser",45678);
    System.out.println("enter your username");
    String username=s.next();
    int count=0;
    for(int i=0;i<5;i++) {
      if(count==3){
        System.out.println("contact admin");
        break;
      }
      if(user.containskey(username)){
        System.out.println("enter your password");
        int p=s.nextInt();
        if(user.get(username)==p){
          System.out.println("welcome:"+username);
          break;
          else{count++;System.out.println("wrong password"); 
              }
        }
        else{
          count++; System.out.println("you're fake);}
                                      }
                                      }
                                      }
                                      
                                      
                                    
                                      
                                      
                                      
                                    
                                 
                                      
                                      
