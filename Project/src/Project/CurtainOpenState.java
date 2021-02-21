package Project;

public class CurtainOpenState implements CurtainState {
	CurtainContext Curtain;
	
	public CurtainOpenState(CurtainContext Curtain) {
		this.Curtain = Curtain;
	}

	@Override
	public void OpenCurtain() {
		//do nothing
		System.out.println("Opened curtain remained opened.");
	}

	@Override
	public void CloseCurtain() {
		// TODO Auto-generated method stub
		this.Curtain.ChangeCurtainState(new CurtainCloseState(this.Curtain));
		System.out.println("Opened curtain now closes.");
	}

	@Override
	public void PrintStatus() {
		System.out.println("Current Curtain Status: Opened");	
	}
}
