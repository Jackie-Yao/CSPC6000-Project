package Project;

public class LightCommandDimDown implements LightCommand {

	Light light;
	
	public LightCommandDimDown(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.DimDown();
	}
	
}
