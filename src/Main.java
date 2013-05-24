public class Main {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// BankMain.Main();
		
		SortingCriterion s1 = new SortingCriterion() {
			public boolean isLowerThen(CData a, CData b) {
				return OrderInDescId.isLessThen(a, b);
			}
		};

		SortingCriterion s2 = new SortingCriterion() {
			public boolean isLowerThen(CData a, CData b) {
				return OrderInAlphName.isLessThen(a, b);
			}
		};
		
		
	}

}
