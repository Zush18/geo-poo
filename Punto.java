import java.lang.Math;

public class Punto{
    private double x;
    private double y;
    private String n;

    public Punto()
        { n=""; x = y = 0; }
    public Punto(String s, double i)
        { n=s; x=y=i; }
    public Punto(String s, double i, double j)
        { n=s; x=i; y=j; }
    public Punto(double i)
        { n=""; x=y=i; }
    public Punto(double i, double j)
        { n=""; x=i; y=j; }

    public double gx(){ return x; }
    public double gy(){ return y; }
    public String gs(){ return n; }
    
    public void sx(double i){ x=i; }
    public void sy(double j){ y=j; }
    public void ss(String s){ n=s; }

    public String toString()
        {return n+"("+x+","+y+")";}
    
    public double mag()
        {return Math.sqrt( x*x + y*y );}

	public double distancia( Punto p )
		{return this.distancia(p.gx(),p.gy());}

	public double dis( Punto p )
		{return this.distancia( p );}

    public double distancia(double i, double j)
        {return Math.sqrt( Math.pow(x-i,2) + Math.pow(y-j,2) );}

    public int cuadrante()
        {return (x>=0)? (y>=0)? 1:4 : (y>=0)? 2:3;}

    public Punto neg()
        {return new Punto( -1 * this.gx(), -1 * this.gy() );} 

    public Punto add(Punto p)
        {return new Punto(this.gx() + p.gx(), this.gy() + p.gy());}

	public Punto vec( Punto p )
		{return p.add( this.neg() );}

	public double punto( Punto p )
		{return Trigo.punto( this, p );}

	public double cruz( Punto p )
		{return Trigo.cruz( this, p );}

	public Punto scal( double s )
		{return new Punto( x * s, y * s );}

    public Punto clone(){ return new Punto( this.gx(), this.gy() );}
}
