package chapter2;

/**
 * break与continue的用法
 * 
 * @author 29250 
 * 对一个方法进行注释快捷键：ALT+SHIFT+J；
 * 调整格式：右键——源码——格式化或者ctrl+shift+f
 */
public class Example02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * break的用法
		 */

		for (int a = 1; a <= 5; a = a + 1) {

			//System.out.print(" I love you");
			if(a==3) {
				break;
			}
			System.out.println(a);
			
		}

	}

}
