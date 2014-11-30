public class EscapeFromRectangle_H�ctor {

	public int shortest(int x, int y, int w, int h) {
		int nw = w - x;
		int nh = h - y;
		return Math.min(Math.min(x, y), Math.min(nw, nh));
	}

	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1,
			int p2, int p3, boolean hasAnswer, int p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2
				+ "," + p3);
		System.out.println("]");
		EscapeFromRectangle_H�ctor obj;
		int answer;
		obj = new EscapeFromRectangle_H�ctor();
		long startTime = System.currentTimeMillis();
		answer = obj.shortest(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0
				+ " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}

	public static void main(String[] args) {
		boolean all_right;
		all_right = true;

		int p0;
		int p1;
		int p2;
		int p3;
		int p4;

		// ----- test 0 -----
		p0 = 1;
		p1 = 1;
		p2 = 5;
		p3 = 5;
		p4 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4)
				&& all_right;
		// ------------------

		// ----- test 1 -----
		p0 = 6;
		p1 = 2;
		p2 = 10;
		p3 = 3;
		p4 = 1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4)
				&& all_right;
		// ------------------

		// ----- test 2 -----
		p0 = 653;
		p1 = 375;
		p2 = 1000;
		p3 = 1000;
		p4 = 347;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4)
				&& all_right;
		// ------------------

		// ----- test 3 -----
		p0 = 161;
		p1 = 181;
		p2 = 762;
		p3 = 375;
		p4 = 161;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4)
				&& all_right;
		// ------------------

		if (all_right) {
			System.out
					.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
// Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!