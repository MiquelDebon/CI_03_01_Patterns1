package S3_01_N1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Undo {
    private ArrayList<String> commands = new ArrayList<>();
    private HashMap<Date, String> commandsDate = new HashMap<Date, String>();


    //create an object of SingleObject
    private static Undo instance = new Undo();
    //make the constructor private so that this class cannot be
    //instantiated
    private Undo(){}
    //Method that return the only Instance
    public static Undo getInstance(){
        return Undo.instance;
    }


    public ArrayList<String> getCommands() {
        return this.commands;
    }

    public void getListCommands(){
        for(int i= 0; i<this.commands.size(); i++){
            System.out.println("ID-" + i + ": " + this.commands.get(i));
        }
    }
    public void addCommands(String command) {
        this.commands.add(command);
    }
    public void deleteLastCommad(){
        this.commands.remove(this.commands.size()-1);
    }

    public void deleteCommandByIndex(int index){
        this.commands.remove(index);
    }
    public void deleteLastAmountCommands(int amount){
        int lastIndex = this.commands.size()-1;
        for(int index = lastIndex - amount; index < lastIndex; index++ ){
            this.commands.remove(index);
        }
    }



}

