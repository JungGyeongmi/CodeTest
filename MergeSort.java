import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeSort {
    static int tmp[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tmp = new int[N];
        int[] arr = new int[N];
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        division(arr, 0, N - 1);

        System.out.println(Arrays.toString(arr));
    }

    // 나누기
    static void division(int[] arr, int left, int right) {
        // 원소가 하나가 될때까지 분할
        if (left == right)
            return;
        int mid = (int) (left + right) / 2;
        // 중앙값을 기준으로 분해 반복
        division(arr, left, mid);
        division(arr, mid + 1, right);
        merge(arr, left, right);
    }

    // 합치기
    static void merge(int[] arr, int left, int right) {
        /*
         * L <= left 값 저장
         * R <= mid + 1 값 저장
         * K <= left 값 저장, 임시 배열 인덱스 값 제어
         * a <= 원본 배열 인덱스 값 제어
         */
        int L, R, k, a;

        int mid = (int) (left + right) / 2;

        L = left;
        R = mid + 1;
        k = left;

        // left와 right index가 모두 범위 안에 있을때까지 반복해서 배열 복사
        while (L <= mid && R <= right) {
            // 왼쪽 배열과 오른쪽 배열의 처음을 기준으로 크기 비교 후 배열 복사
            tmp[k++] = arr[L] <= arr[R] ? arr[L++] : arr[R++];
        }

        // 정렬한 후 합친것 / 남은것은 것을 판단
        if (L > mid)
            // 왼쪽값이 mid보다 크다는 것은 right 배열이 남은것
            for (a = R; a <= right; a++)
                tmp[k++] = arr[a];
        else
            // 오른쪽값이 mid보다 크다는 것은 left 배열이 남은것
            for (a = L; a <= mid; a++)
                tmp[k++] = arr[a];

        // 원본 배열로 이전
        for (a = left; a <= right; a++)
            arr[a] = tmp[a];

    }
}
