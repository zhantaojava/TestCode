package suanfa;

public class Merg_sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m + n - 1;
		int index1 = m - 1;
		int index2 = n - 1;
		// 从后往前把两个指针处的数组值比较，将大的放到nums1[]后面。
		while (index1 >= 0 && index2 >= 0) {
			if (nums1[index1] <= nums2[index2]) {
				nums1[i] = nums2[index2];
				index2--;
			} else {
				nums1[i] = nums1[index1];
				index1--;
			}
			i--;
		}
		// 将剩余的nums2[]中的元素放到nums1[]前面
		while (index2 >= 0) {
			nums1[i] = nums2[index2--];
			i--;
		}

	}

}
