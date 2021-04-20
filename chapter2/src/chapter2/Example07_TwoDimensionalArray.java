package chapter2;

public class Example07_TwoDimensionalArray {

	/**
	 * @param args  二维数组的使用：p74 ，例2-25
	 * 
	 * 第一个销售小组2人，销售额分别为11、12
	 * 第二个销售小组3人，销售额分别为21、22、23
	 * 第三个销售小组4人。销售额分别为31、32、33、34
	 * 现在请利用二维数组的知识统计公司三个销售小组的销售总额，和整个公司的销售额
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int[][] arr=new int[3][4];//行数代表包含的一维数组的个数；列数代表每个一位数组里元素的个数
		
		int[][] arr = new int[3][];           // 定义一个长度为3的二维数组
		arr[0] = new int[] { 11, 12 };        // 为数组的元素赋值
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };
		
		//int[][] arr= {{11,12},{21,22,23},{31,32,33,34}};
		
		int sum = 0;                          // 定义变量记录总销售额
		for (int i = 0; i < arr.length; i++) {// 遍历数组元素
			int groupSum = 0;                 // 定义变量记录小组销售总额
			for (int j = 0; j < arr[i].length; j++) { 
				groupSum = groupSum+arr[i][j];
			}
			System.out.println("第" + (i + 1) + "小组销售额为：" + groupSum + " 万元。");
			
			sum =sum+groupSum;				      // 累加小组销售额
		}
		
		System.out.println("总销售额为: " + sum + " 万元。");

	}

}
