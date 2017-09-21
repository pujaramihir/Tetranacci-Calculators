import java.math.BigInteger;

import jdk.management.resource.internal.UnassignedContext;

/**
 * 
 */

/**
 * @author mihir
 *
 */
public class TetranacciLinerRecursion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long starttime = System.nanoTime();
		long[] answer = linearTetranacci(70);
		long endtime = System.nanoTime();
		System.out.println("Elapsed time (Microseconds) for long "+ (endtime-starttime)/1000);
		System.out.println(answer[3]);
		starttime = System.nanoTime();
		BigInteger[] answer1 = linearTetranacciBig(70);
		endtime = System.nanoTime();
		System.out.println("Elapsed time (Microseconds) for biginteger "+ (endtime-starttime)/1000);
		System.out.println(answer1[3]);
		
	}
	/**
	 * 
	 * @param n
	 * @return last 4 numbers of tetranacci series
	 */
	public static long[] linearTetranacci(int n) {
		if (n <= 4) {
			return new long[] {0,0,1,1};
		} else {
			long[] temp = linearTetranacci(n - 1);
			return new long[] {temp[1], temp[2], temp[3], temp[0]+ temp[1] + temp[2] + temp[3]};
		}
	}
	

	/**
	 * 
	 * @param n
	 * @return last 4 numbers of tetranacci series
	 */
	public static BigInteger[] linearTetranacciBig(int n) {
		if (n <= 4) {
			return new BigInteger[] {BigInteger.ZERO,BigInteger.ZERO,BigInteger.ONE,BigInteger.ONE};
			
		} else {
			BigInteger[] temp = linearTetranacciBig(n - 1);
			
			return new BigInteger[] {temp[1], temp[2], temp[3], temp[0].add(temp[1].add(temp[2]).add(temp[3]))};
		}
	}
	
}
