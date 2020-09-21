package command;

import storage.Storage;
import tasks.Deadline;
import tasks.Event;
import tasks.Todo;

import java.text.ParseException;
import java.util.Date;

/**
 * This is a action class, all command wil be exec down here.
 */
public class Converter {


    private Storage storage;
    private Time timeDate;
    //private String time;

    public Converter(){

        storage = new Storage();
        timeDate = new Time();
    }

    public void saveToDo(String description, String time) {
        storage.setCommandName(new Todo(description,time));
    }

    public void saveEvent(String description, String time) throws ParseException {
        storage.setCommandName(new Event(description,time));
    }

    public void saveDeadLine(String description, String time) throws ParseException {
        storage.setCommandName(new Deadline(description,time));
    }


    public void find(String description) throws ParseException {
        printArray(description);


    }


    public void fileLoader(){
        storage.readFromFile();
    }

    public void fileWriter(){
        storage.saveToFile();
    }


   // make done method
    public void makeDone(String description) throws DukeException {
            String clean = description.replaceAll("\\D+", "");
            int num = Integer.parseInt(clean);
            changeToDone(num);
    }


    // change task into done. c means complete x means not done yet.
    private void changeToDone(int num){
        if (num <= storage.getCommandName().size()){
            int num1=num - 1;
            String makeDone = storage.getCommandName().get(num1).toString();
            System.out.println(makeDone.replace("x","c") + "has been set to done");
            storage.getCommandName().set(num1,makeDone.replace("x","c"));
        }
        else {
            System.out.println("Invalid Input");
        }
    }


    // make delete method
    public void makeDelete(String description) throws DukeException {
            String clean = description.replaceAll("\\D+", "");
            int num = Integer.parseInt(clean);
            deleting(num);
    }

    // tasks deleting function
    private void deleting(int num){
        if (num <= storage.getCommandName().size()){
            int num1=num - 1;
            System.out.println(storage.getCommandName().get(num1) + "has been deleted");
            storage.getCommandName().remove(num1);
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    // print array list method
    public void printData() throws ParseException {
       printArray();
    }


    private void printArray() throws ParseException {
            int number = 1;
            for (Object task : storage.getCommandName()) {
                String[] obj = task.toString().split("\\|");
                Date time = timeDate.timeConverter(obj[1].replaceFirst(" ",""));
                System.out.println(number + ". "+ obj[0] + " by "+ time);
                number ++;
            }
    }

    private void printArray(String description) throws ParseException {
        int number = 1;
        for (Object task : storage.getCommandName()) {
            if(task.toString().contains(description)) {
                String[] obj = task.toString().split("\\|");
                Date time = timeDate.timeConverter(obj[1].replaceFirst(" ", ""));
                System.out.println(number + ". " + obj[0] + " by " + time);
            }
            number ++;
        }
    }
    public boolean checkDataSize(){
        if(storage.getCommandName().isEmpty()){
            return true;
        }
        return false;
    }
}
