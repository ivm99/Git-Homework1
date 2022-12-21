package Notes.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NoteMapper implements iNoteMap{
    public String map(Note note) {
        return String.format("%d; %s; %s; %s", note.getId(), note.getTitle(), note.getDescription(), note.dateFormatting(note.getDate()));
    }

    public Note map(String line) {
        String[] lines = line.strip().split(";");
        String [] dateStr = lines[3].strip().split("-");
        Calendar date = new GregorianCalendar(Integer.parseInt(dateStr[2]), Integer.parseInt(dateStr[1])-1, Integer.parseInt(dateStr[0]));
        return new Note(Integer.parseInt(lines[0]), lines[1], lines[2], date);
    }
}
