package codeTestColl.recursion;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chickenCoupon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String inputVal;

        while ((inputVal = br.readLine()) != null && !inputVal.isEmpty()) {
            st = new StringTokenizer(inputVal, " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int count = 0;
            int stamp = 0;
            int coupon = n;

            while (true) {

                count += coupon;
                stamp = coupon;
                coupon = stamp / k;
                stamp %= k;

                if (coupon == 0) {
                    break;
                }

            }
            System.out.println(count);
        }
    }
}
