package chapter2;

public class Example06 {

	/**
	 * @param args 數組排序
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = { 9, 8, 3, 5, 2 };
		
		// 1、冒泡排序前，先循环打印数组元素
		System.out.print("排序前："+"\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // 用于换行
		
		
		// 2、进行冒泡排序
		// 2.1、外层循环定义需要比较的轮数（两数对比，要比较n-1轮）
		for (int  i= 1; i < arr.length; i++) {
			// 2.2、内层循环定义第i轮需要比较的两个数
			for (int j = 0; j < arr.length -i; j++) {
				if (arr[j] > arr[j + 1]) { // 比较相邻元素
					// 下面的三行代码用于相邻两个元素交换
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		// 3、完成冒泡排序后，再次循环打印数组元素
		System.out.print("排序后："+"\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
