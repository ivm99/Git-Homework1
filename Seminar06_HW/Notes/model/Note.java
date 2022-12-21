package Notes.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Note {
    private int id;
    private String title;
    private String description;
    private Calendar date;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Note(String title, String description, Calendar date) {
        this(title, description);
        this.date = date;
    }

    public Note(int id, String title, String description) {
        this(title, description);
        this.id = id;
    }
    
    public Note(int id, String title, String description, Calendar date) {
        this(title, description, date);
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String dateFormatting(Calendar calendar) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = df.format(calendar.getTime());
        return strDate;
    }

    @Override
    public String toString() {
        return String.format("Id: %s\nЗаголовок: %s \nОписание: %s \nДата: %s", id, title, description, dateFormatting(date));
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
