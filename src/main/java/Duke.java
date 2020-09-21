import command.DukeException;
import command.Switch;
import storage.Storage;

import java.text.ParseException;


/**
 * This is a small bot program to allow user to record their tasks and save in a txt file
 *
 */
public class Duke {
    private Storage storage;


    public static void run() throws DukeException, ParseException {
        //...
        Switch switchTasks = new Switch();
        switchTasks.option();
    }

    public static void main(String[] args) throws DukeException, ParseException {
        run();
    }
}
