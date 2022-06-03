package Keychain;

import java.util.UUID;

import Keychain.KeyChain.Keyshape;

public class Key implements Cloneable, Comparable<Key>{
	private UUID key;
	private Keyshape shape = Keyshape.Unknown;
	
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
	
	@Override
	public Object clone() {
		return new Key(this);
	}
	public Keyshape shape() {
		return shape;
	}
	
	@Override
	public String toString() {
		return key.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!getClass().isInstance(obj)) return false;
		Key other = (Key)obj;
		return key.equals(other.key);
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	
	@Override
	public int compareTo(Key o) {
		// TODO Auto-generated method stub
		return key.compareTo(o.key);
	}
	
	
}
