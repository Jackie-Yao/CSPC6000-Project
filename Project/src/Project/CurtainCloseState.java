package Project;

public class CurtainCloseState implements CurtainState {
	CurtainContext Curtain;
	String indent = "	";
	
	public CurtainCloseState(CurtainContext Curtain) {
		this.Curtain = Curtain;
	}

	@Override
	public void OpenCurtain() {
		this.Curtain.ChangeCurtainState(new CurtainOpenState(this.Curtain));
		System.out.println(this.indent + "Closed curtain now opens.");
	}

	@Override
	public void CloseCurtain() {
		//do nothing
		System.out.println(this.indent +"Closed curtain remained closed.");
	}

	@Override
	public void PrintStatus() {
		System.out.println(this.indent + "Current Curtain Status: " + this.getStatus());	
		
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Closed";
	}
}
