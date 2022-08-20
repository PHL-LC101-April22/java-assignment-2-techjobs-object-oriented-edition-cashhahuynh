package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextID = 1;
    private String value;

    public JobField() {
        id = nextID;
        nextID ++;
    }

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;

        JobField jobField = (JobField) o;

        if (id != jobField.id) return false;
        return value != null ? value.equals(jobField.value) : jobField.value == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id; //why is this returning 6 instead of 1...
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
