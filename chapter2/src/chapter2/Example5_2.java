package chapter2;

public class Example5_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int[] arr = { 25, 24, 12, 76, 101, 96, 28 };// 定义数组

		System.out.println("排序前：");
		for (int k = 0; k < 7; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println("");

		// 一共7个元素，需要排序6次
		for (int i = 1; i < 7; i++) {

			// 两两比较，进行交换
			for (int j = 0; j < 7 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				// 输出每次排序后的结果：
				System.out.println("第" + i + "次排序：");
				for (int k = 0; k < 7; k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.println("");
			}

		}

	}

}
