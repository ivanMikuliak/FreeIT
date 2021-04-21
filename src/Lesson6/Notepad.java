package Lesson6;

import java.time.LocalDate;

public class Notepad {
    private Note[] notes;
    private LocalDate date;

    public Notepad(int size) {
        this.notes = new Note[size];
        this.date = LocalDate.now();
    }

    public Note[] getNotes() {
        return notes;
    }

    class Note {
        private String record;

        public String getRecord() {
            return record;
        }

        public void setRecord(String record) {
            this.record = record;
        }
    }
}
