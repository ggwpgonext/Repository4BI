
public class Triangolo {
	
	private float base, altezza;

	public Triangolo(){
	}
	
	public float areaTriangolo() {
		return base*altezza;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	
	public String toString() {
		return "Triangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
	
	
	

}
