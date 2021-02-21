package Project;

public class LightCommandDimUp implements LightCommand {

	Light light;
	
	public LightCommandDimUp(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.DimUp();
	}
	
}
