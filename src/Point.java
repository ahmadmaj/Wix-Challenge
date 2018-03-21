
public class Point {

	private int x;
	private int y;
		
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	/*
	public boolean equals(Object p){
		return ((x == ((Point)p).x) && (y == ((Point)p).y));
	}
	
	public int hashCode() {
	    String hash = new Integer(x).toString() + new Integer(y).toString();
	    return hash.hashCode();
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
