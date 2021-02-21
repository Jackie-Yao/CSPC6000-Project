package Project;

public class CurtainContext {
	CurtainState curtainstate;
	
	public CurtainContext(){
		this.curtainstate = new CurtainOpenState(this);
	}
	
	public void ChangeCurtainState(CurtainState curtainstate) {
		this.curtainstate = curtainstate;
	}
	
	public void OpenCurtain() {
		System.out.println("Action: Open");
		this.curtainstate.OpenCurtain();
	}
	
	public void CloseCurtain() {
		System.out.println("Action: Close");
		this.curtainstate.CloseCurtain();
	}
	
	public void PrintStatus() {
		this.curtainstate.PrintStatus();
	}
}
