package player;

import java.util.*;

public class Player {
    String name;
    String contactNo;
    String emailId;
    int age;

    public void setPlayerDetails(String name,String contactNo,String emailId,int age){
        this.name=name;
        this.age=age;
        this.contactNo=contactNo;
        this.emailId=emailId;
    }

    public void setPlayerName(String name){
        this.name=name;
    }

    public void getPlayerDetails(){
        System.out.println("Player name: "+this.name);
        System.out.println("Player age:"+this.age);
        System.out.println("Player contactNo:"+this.contactNo);
        System.out.println("Player emailId:"+this.emailId);
    }

    public String getPlayerName(){
        return this.name;
    }

    public void setPlayerDetailsFromUserInput(Player p){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Player Details:");
        System.out.print("Player name:");
        String name=scn.next();
        System.out.print("Player age:");
        int age=scn.nextInt();
        System.out.print("Player contact no:");
        String contactNo=scn.next();
        System.out.print("Player email id:");
        String emailId=scn.next();

        p.setPlayerDetails(name,contactNo,emailId,age);
        
    }

}
