package Keychain;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key>{
	private UUID key;
	private Keyshape shape = Keyshape.Unknown;
	public enum Keyshape{
		Square,Rectanglular,Circular,oval,TrapezoidDown,TrapezoidUp,Irregular,Unknown
	}
	
	public Key() {
		key = UUID.randomUUID();
	}
	public Key(Keyshape shape) {
		this();
		this.shape = shape;
	}
	
	public Key(Key original) {
		key = original.key;
		shape = original.shape;
	}
	public Keyshape shape() {
		return shape;
	}
	@Override
	public String toString() {
		return key.toString();
	}
	@Override
	public int compareTo(Key o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
