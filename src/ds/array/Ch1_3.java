package ds.array;

public class Ch1_3 {
	/**
	 * @param str
	 * ? This is passed into a function as a pointer only.
	 * Changing the variable 'str' in this function
	 * also changes the value of 'str' in the original.
	 */
	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
			int j;
			/**
			 * instead of going on till the end
			 * this is a smarter way to iterate through for loop.
			 * We use break for those violated situation.
			 * If the loop still carry on till the end, we have 
			 * a successful case.
			 */
			for (j = 0; j < tail; ++j) { 
				if (str[i] == str[j]) break;
			}
			/**
			 * no need to keep a flag variable
			 */
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		/**
		 * A better way to mark the end of a string
		 */
		str[tail] = 0;
	}
	
	/**
	 * @param str
	 * 
	 * I was overthinking. I thought about creating a new char[]
	 * to keep track of those unduplicated characters.
	 */
	public static void removeDuplicatesQ(char[] str) {
		
		for (int i = 0; i < str.length; ++i) {
			char ch = str[i];
			boolean flagDuplicate = false;
			
			for (int j = i + 1; j < str.length; ++j) {
				if (ch == str[j]) {
					flagDuplicate = true;
				}
			}
			System.out.println(ch);
			System.out.println(flagDuplicate);
		}
	}
	

	
	public static void main(String[] args) {
		char[] str = "xuanxquynh".toCharArray();
		removeDuplicates(str);
		System.out.println(str);
	}
}
