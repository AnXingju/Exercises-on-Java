package chapter2;

public class Example05 {

	/**
	 * @param args �������ֵ���� P70 ��2-23
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		// 1������һ��int[]����
		int[] arr = { 4, 1, 6, 3, 9, 8 };
		// 2���������max���ڼ�ס����������ȼ����һ��Ԫ��Ϊ���ֵ
		int max = arr[0];
		// 3���������飬�������ֵ
		for (int i = 1; i < arr.length; i++) {
			// �Ƚ� arr[i]��ֵ�Ƿ����max
			if (arr[i] > max) {
				// ������������arr[i]��ֵ����max
				max = arr[i];
			}
		}
		System.out.println("����arr�е����ֵΪ��" + max); // ��ӡ���ֵ

	}

}
