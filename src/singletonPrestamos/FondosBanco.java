package singletonPrestamos;


public class FondosBanco {
	private static FondosBanco instance = null;
	private double plata;

    private FondosBanco() {
    	plata = 200000;
    	System.out.println("Los fondos son: " +plata);
        
    }

    public double getPlata(double plata) {
    	if(plata <= this.plata) {
    		this.plata= this.plata - plata;
    		return plata;
    	}
		return -1;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
	public double verPlata() {
		return plata;
	}

	public static synchronized FondosBanco getUniqueInstance() {
        if (instance == null)
            instance = new FondosBanco();
        return instance;
    }

    public void myInstance() {
        System.out.println("Using draft.Singleton");
    }

    public void destroyInstance() {
        instance = null;
    }

}
