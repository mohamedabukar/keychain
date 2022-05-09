package Keychain;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class KeyChain {
	private Set<Key> keys = new TreeSet<Key>();
	public KeyChain() {}
	public KeyChain(Collection<Key> keys) {
		this.keys.addAll(keys);
	}
	public boolean addKey(Key key) {
		return keys.add(key);
	}
	public boolean removeKey(Key key) {
		return keys.remove(key);
	}
	public int keyCount() {
		return keys.size();
	}
	public boolean lock(Door door) {
		if(door.isLocked()) return true;
		for(Key k : keys) {
			if(door.unlock(k)) return true;
		}
		return false;
	}
	public boolean unlock(Door door) {
		if(!door.isLocked()) return true;
		for(Key k : keys) {
			if(door.unlock(k)) return true;
		}
		return false;
	}
}

