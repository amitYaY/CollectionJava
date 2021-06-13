package com.collections.map;

@SuppressWarnings("unchecked")
public class CustomMap<T,R> {
	
	private Entry<T, R>[] map = null;
	
	public CustomMap() {
		map =  new Entry[16];
	}
	
	public R put(T key, R value) {
		R returnVal = null;
		int index = key.hashCode() % 16;
		if (map[index] == null) {
			map[index] = new Entry<T, R>(key, value, null);
		} else {
			Entry<T, R> entry = map[index];
			Entry<T, R> temp = null;
			while(entry!=null) {
				if(entry.getKey().equals(key)) {
					returnVal = entry.getValue();
					entry.setValue(value);
					return returnVal;
				}
				temp = entry;
				entry = entry.next;
			}
			temp.setNext(new Entry<T, R>(key, value, null));
		}
		return returnVal;
	}
	
	public R get(T key) {
		
		int index = key.hashCode() % 16;
		
		if (map[index] == null) {
			return null;
		} else {
			Entry<T, R> entry = map[index];
			while(entry!=null) {
				if(entry.getKey().equals(key)) {
					return entry.getValue();
				}
				entry = entry.next;
			}
		}
		
		return null;
	}
	
	
	public static class Entry<T,R> {
		
		private T key;
		
		private R value;
		
		private Entry<T,R> next;
		
		public Entry(T key, R value, Entry<T,R> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public Entry<T, R> getNext() {
			return next;
		}

		public void setNext(Entry<T, R> next) {
			this.next = next;
		}

		public T getKey() {
			return key;
		}

		public void setKey(T key) {
			this.key = key;
		}

		public R getValue() {
			return value;
		}

		public void setValue(R value) {
			this.value = value;
		}
		
	}
	

}
