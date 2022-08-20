package org.launchcode.techjobs.oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId ++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer; //something here?
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {
        if (this.getName().equals("")) {
            this.setName("Data not available");
        }
        if (this.getEmployer().toString().equals("")) {
            employer = new Employer("Data not available");
            this.setEmployer(employer);
        }
        if (this.getLocation().toString().equals("")) {
            location = new Location("Data not available");
            this.setLocation(location);
        }
        if (this.getPositionType().toString().equals("")) {
            positionType = new PositionType("Data not available");
            this.setPositionType(positionType);
        }
        if (this.getCoreCompetency().toString().equals("")) {
            coreCompetency = new CoreCompetency("Data not available");
            this.setCoreCompetency(coreCompetency);
        }
        String id = "\nID: " + this.getId() + "\n"; //something is weird here...
        String name = "Name: " + this.getName() + "\n";
        String employer = "Employer: " + this.getEmployer() + "\n";
        String location = "Location: " + this.getLocation() + "\n";
        String positionType = "Position Type: " + this.getPositionType() + "\n";
        String coreCompetency = "Core Competency: " + this.getCoreCompetency() + "\n";
        String total = id + name + employer + location + positionType + coreCompetency;
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;

        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
