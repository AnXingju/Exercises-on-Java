package chapter2;

public class Example06 {

	/**
	 * @param args ���M����
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr = { 9, 8, 3, 5, 2 };
		
		// 1��ð������ǰ����ѭ����ӡ����Ԫ��
		System.out.print("����ǰ��"+"\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // ���ڻ���
		
		
		// 2������ð������
		// 2.1�����ѭ��������Ҫ�Ƚϵ������������Աȣ�Ҫ�Ƚ�n-1�֣�
		for (int  i= 1; i < arr.length; i++) {
			// 2.2���ڲ�ѭ�������i����Ҫ�Ƚϵ�������
			for (int j = 0; j < arr.length -i; j++) {
				if (arr[j] > arr[j + 1]) { // �Ƚ�����Ԫ��
					// ��������д���������������Ԫ�ؽ���
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		// 3�����ð��������ٴ�ѭ����ӡ����Ԫ��
		System.out.print("�����"+"\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
