package chapter2;

public class Example5_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		int[] arr = { 25, 24, 12, 76, 101, 96, 28 };// ��������

		System.out.println("����ǰ��");
		for (int k = 0; k < 7; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println("");

		// һ��7��Ԫ�أ���Ҫ����6��
		for (int i = 1; i < 7; i++) {

			// �����Ƚϣ����н���
			for (int j = 0; j < 7 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				// ���ÿ�������Ľ����
				System.out.println("��" + i + "������");
				for (int k = 0; k < 7; k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.println("");
			}

		}

	}

}
