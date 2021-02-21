package Project;

public class CurtainCloseState implements CurtainState {
	CurtainContext Curtain;
	
	public CurtainCloseState(CurtainContext Curtain) {
		this.Curtain = Curtain;
	}

	@Override
	public void OpenCurtain() {
		this.Curtain.ChangeCurtainState(new CurtainOpenState(this.Curtain));
		System.out.println("Closed curtain now opens.");
	}

	@Override
	public void CloseCurtain() {
		//do nothing
		System.out.println("Closed curtain remained closed.");
	}

	@Override
	public void PrintStatus() {
		System.out.println("Current Curtain Status: Closed");	
		
	}
}
