package Keychain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Keychain.KeyChain.Keyshape;

public class Warehouse {
	Set<Door> wrg;
	
	public Warehouse() {
		wrg = new HashSet<Door>();
	}
	public static void main(String[] args) {
		ArrayList<Keyshape> shapes = new ArrayList<Keyshape>();
		for(Keyshape shape: Keyshape.values()) {
			shapes.add(shape);
		}
		for(int i = 0; i <99; i++) {
			if(i<89) {
				Door d= new Door()
			}
		}
			
		
	}

}
