package Project;

public class Light {
	//minimum 0, max 10
	double DimTime;
	double Lightness;
	String indent = " 	";
	
	public Light() {
		//default dim off/on time to be 10 minutes
		this.DimTime = 10;
	}
	
	public Light(int DimTime) {
		this.DimTime = DimTime;
	}
	
	public void PrintLightness() {
		System.out.println("Lightness = " + String.format("%3.0f", this.Lightness)  + " %" );
	}
	
	
	public void DimUp() {		
		int i ;
		for(i = 0; i <= DimTime; i = i +2) {
			this.Lightness = i/DimTime * 100.00;
			System.out.print( this.indent + "After " + String.format("%2d", i) + " min: ");
			this.PrintLightness();
		}

	}
	
	public void DimDown() {
		int i ;
		
		for(i = 0; i <= DimTime; i = i +2) {
			this.Lightness = (1.00 - i/DimTime) * 100.00;
			System.out.print(this.indent + "After " + String.format("%2d", i) + " min: ");
			this.PrintLightness();
		}
	}
	
}
