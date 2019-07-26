package algo.skiplist;

public class SkipListEntry {

	//data
	public String key;
	public Integer value;
	
	//links
	public SkipListEntry left;
	public SkipListEntry right;
	public SkipListEntry up;
	public SkipListEntry down;
	
	//special
	public static final String negInf = "-00";
	public static final String posInf = "+00";
	
	//constructor
	public SkipListEntry(String key, Integer value) {
		this.key = key;
		this.value = value;
	}
}
