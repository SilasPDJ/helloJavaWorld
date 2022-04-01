package helloWorld;

public class helloWorld {
	// double has more decimal places

	private static double getMedia(int[] nums) {
		int somaNums;
		double media, mediaDaMedia;
		somaNums = 0;
		for (var i : nums) {
			somaNums += i;
		}
		media = somaNums / nums.length;
		return media;
	}

	private static double getMedia(double[] nums) {
		int somaNums;
		double media, mediaDaMedia;
		somaNums = 0;
		for (var i : nums) {
			somaNums += i;
		}
		media = somaNums / nums.length;
		return media;
	}

	private static void printMedia(int[] array, double media) {
		System.out.print("A média de: ");
		int index = 0;
		for (int d : array) {

			if (index == array.length - 1) {
				System.out.print("e %d ".formatted(d));
			} else {
				System.out.print("%d ".formatted(d));
			}
			index++;
		}
		System.out.print(" É: %.2f".formatted(media));
		System.out.println("");
	}

	private static void printMedia(double[] array, double media) {
		System.out.print("A média de: ");
		int index = 0;
		for (double d : array) {

			if (index == array.length - 1) {
				System.out.print("e %d ".formatted(d));
			} else {
				System.out.print("%d ".formatted(d));
			}
			index++;
		}
		System.out.print(" É: %.2f".formatted(media));
		System.out.println("");
	}

	public static void ex2() {
		double media1, media2, mediaDasMedias;
		String message;

		int nums1[] = { 8, 9, 10 };
		media1 = getMedia(nums1);
		int nums2[] = { 4, 5, 6 };
		media2 = getMedia(nums2);
		double mediaFinal[] = { media1, media2 };
		mediaDasMedias = getMedia(mediaFinal);
		printMedia(nums1, media1);
		printMedia(nums2, media2);
		printMedia(mediaFinal, mediaDasMedias);
	}

	public static void main(String[] args) {
		ex2();
//		System.out.println("Hello World!");

	}
}
