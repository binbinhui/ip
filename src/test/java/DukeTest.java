import command.Converter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import command.Time;
import storage.Storage;
import tasks.Deadline;
import tasks.Event;
import tasks.Todo;

import java.text.ParseException;


public class DukeTest {

    @Test
    public void dummyTest(){
        assertEquals(2,2);
    }

    @Test
    public void timeValidator() throws ParseException {
        Time time = new Time();
        //time.timeChecker("2/12/2019 1800");
        assertEquals(true,time.timeChecker("2/12/2019 1800"));
        assertEquals("Mon Dec 02 18:00:00 SGT 2019", time.timeConverter("2/12/2019 1800").toString());
    }
    @Test
    public void todoTest(){
        Todo todo = new Todo("Read Book", "");
        assertEquals("[T][x] Read Book",todo.toString());

    }
    @Test
    public void deadlineTest(){
        Deadline deadline = new Deadline("Read Book", "2/12/2019 1800");
        assertEquals("[D][x] Read Book | 2/12/2019 1800",deadline.toString());

    }

    @Test
    public void eventTest(){
        Event event = new Event("Read Book", "2/12/2019 1800");
        assertEquals("[E][x] Read Book | 2/12/2019 1800",event.toString());

    }
    

}
