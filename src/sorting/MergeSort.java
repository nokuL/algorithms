package sorting;

import java.util.Arrays;

public class MergeSort {
        public int[] sortArray(int[] nums) {
            if (isValid(nums)) {
                return mergeAndSort(nums);
            } else {
                return new int[0]; // Return an empty array or throw an exception to indicate invalid input
            }
        }

        private int[] mergeAndSort(int[] nums) {
            if (nums.length <= 1) {
                return nums; // Base case: array with 0 or 1 element is already sorted
            }

            int mid = nums.length / 2;
            int[] leftArray = Arrays.copyOfRange(nums, 0, mid);
            int[] rightArray = Arrays.copyOfRange(nums, mid, nums.length);

            leftArray = mergeAndSort(leftArray);
            rightArray = mergeAndSort(rightArray);

            return merge(nums, leftArray, rightArray);
        }

        private int[] merge(int[] nums, int[] leftArray, int[] rightArray) {
            int leftLen = leftArray.length;
            int rightLen = rightArray.length;
            int i = 0, j = 0, k = 0;

            while (i < leftLen && j < rightLen) {
                if (leftArray[i] <= rightArray[j]) {
                    nums[k] = leftArray[i];
                    i++;
                } else {
                    nums[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < leftLen) {
                nums[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < rightLen) {
                nums[k] = rightArray[j];
                j++;
                k++;
            }

            return nums;
        }

        private boolean isValid(int[] nums) {
            if (nums.length < 1 || nums.length > 5 * Math.pow(10, 4)) {
                return false;
            } else {
                for (int num : nums) {
                    if (num < -5 * Math.pow(10, 4) || num > 5 * Math.pow(10, 4)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

