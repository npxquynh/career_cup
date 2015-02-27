package ds.array;

public class Ch1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "reab";
		String t = "bear";
		
		boolean result = anagramQ(s, t);
		System.out.println(result);
		
	}
	
	/**
	 * The code from the book is kind of complicated.
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean anagramQ(String s, String t) {
		int s_len = s.length();
		int t_len = t.length();
		if (s_len != t_len) return false;
		
		int[] hits = new int[256];
		for (int i = 0; i < 256; ++i) {
			hits[i] = 0;
		}
		
		for (int i = 0; i < s_len; ++i) {
			hits[s.charAt(i)] += 1;
		}
		
		for (int i = 0; i < s_len; ++i) {
			hits[t.charAt(i)] -= 1;
		}
		
		for (int i = 0; i < 256; ++i) {
			if (hits[i] != 0) return false; 
		}
		
		return true;
	}

}
