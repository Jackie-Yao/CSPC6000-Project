package Project;

public class CurtainContext {
	CurtainState curtainstate;
	String indent = " 	";
	
	public CurtainContext(){
		this.curtainstate = new CurtainOpenState(this);
	}
	
	public void ChangeCurtainState(CurtainState curtainstate) {
		this.curtainstate = curtainstate;
	}
	
	public void OpenCurtain() {
		System.out.println(this.indent + "Action: Open");
		this.curtainstate.OpenCurtain();
	}
	
	public void CloseCurtain() {
		System.out.println(this.indent + "Action: Close");
		this.curtainstate.CloseCurtain();
	}
	
	public void PrintStatus() {
		this.curtainstate.PrintStatus();
	}
	
	public String getStatus() {
		return this.curtainstate.getStatus();
	}
}
