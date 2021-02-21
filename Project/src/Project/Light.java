package Project;

public class Light {
	//minimum 0, max 10
	int Lumens;
	
	public Light() {
		this.Lumens = 0;
	}
	
	public void PrintLumens() {
		System.out.println("Current Lumens of the light: " + this.Lumens);
	}
	
	
	public void DimUp() {
		int i = 0;
		while(i <= 10) {
			this.Lumens = i;
			this.PrintLumens();
			i++;
		}
	}
	
	public void DimDown() {
		int i = 10;
		while(i >= 0) {
			this.Lumens = i;
			this.PrintLumens();
			i--;
		}
	}
	
}
