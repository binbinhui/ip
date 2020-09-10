package tasks;

import tasks.Tasks;

public class Deadline extends Tasks {


    public Deadline(String description, String time){
        super(description, time);
        super.type= "[D]";
    }


    public String toString(){

        return type + status +" "+description +" (" + time +")";
    }

}