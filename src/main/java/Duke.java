import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);





        // Welcome msg
        System.out.println("Hello! I'm Duke\nWhat can I do for you?\n");

        // user input
        //Scanner myObj = new Scanner(System.in);


        SwitchTasks switchTasks = new SwitchTasks();
        switchTasks.option();




        //Good Bye msg
        System.out.println("Bye. Hope to see you again soon!");


    }
}
