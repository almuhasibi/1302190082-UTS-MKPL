package lib;
import java.util.List;
import java.util.LinkedList;

public class Family extends Employee {
    private String spouseName;
	private String spouseIdNumber;
    private List<String> childNames;
	private List<String> TotalChildrens;
    
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
}
