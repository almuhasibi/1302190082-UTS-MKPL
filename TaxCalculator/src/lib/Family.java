package lib;
import java.util.List;
import java.util.LinkedList;

public class Family extends Employee {
    private String spouseName;
	private String spouseIdNumber;
    private List<String> childNames;
	private List<String> TotalChildrens;
    private String childName;
    
    public Family(Employee worker){
        super(worker.getFirstName(), worker.getLastName(), worker.getEmployeeId(), 
        worker.getAddress(), worker.getForeigner());

        childNames = new LinkedList<String>();
		TotalChildrens = new LinkedList<String>();
    }

    public void setSpouseName(String spouseName){
        this.spouseName = spouseName;
    }
    public void setSpouseNumber(String spouseIdNumber){
        this.spouseIdNumber = super.getEmployeeId();
    }


    public void addChild(String childName, String childIdNumber){
        childNames.add(childName);
        TotalChildrens.add(childIdNumber);
    }

    public String getSpouseName(){
        return spouseName;
    }
    public String getSpouseNumber(){
        return spouseIdNumber;
    }

    public List<String> getChildIdNumber(){
        return TotalChildrens;
    }
    public void Children(String childName, List<String> TotalChildrens) {
        this.childName = childName;
        this.TotalChildrens = TotalChildrens;
    }

    public String getChildName() { // get child name
        return childName;
    }

    public void setChildName(String childName) { //Set child name
        this.childName = childName;
    }

    public List<String> getTotalChildrens() { // getter child
        return TotalChildrens;
    }

    public void setTotalChildrens(List<String> TotalChildrens) { // set total child
        this.TotalChildrens = TotalChildrens;
    }
}
