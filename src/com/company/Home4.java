package com.company;

/**
 * Created by Vea on 09.08.2015.
 */
public class Home4 {
    public static void main(String[] args) {
        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        vMassCompare(operand1,operand2,expectedResults);
// Tests PASSED
        int[] operand3 = {76, 91, 4, 87, 70, 57, 45, 30, 30, 121, 18, 40, 76};
        int[] operand4 = {76, 49, 36, 77, 87, 28, 101, 60, 20, 0, 86, 34, 34};
        int[] expectedResults2 = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        vMassCompare(operand3,operand4,expectedResults2);
// Expected: 51; Actual: 50
// Tests FAILED
        int[] operand5 = {96, 35, 71, 54, 87, 76, 85, 30, 94, 8, 88, 82, 20};
        int[] operand6 = {2, 63, 33, 91, 98, 20, 95, 95, 5, 83, 38, 66, 87};
        int[] expectedResults3 = {98, 98, 100, 137, 185, 96, 180, 125, 99, 91, 126, 148, 90};
        vMassCompare(operand5,operand6,expectedResults3);
// Expected: 100; Actual: 104
// Expected: 137; Actual: 145
// Expected: 90; Actual: 107
// Tests FAILED
        int[] operand7 = {41, 39, 64, 56, 48, 52, 57, 82, 12, 53, 80, 24, 75};
        int[] operand8 = {81, 42, 83, 4, 68, 11, 4, 67, 29, 1, 51, 3, 98};
        int[] expectedResults4 = {122, 81, 147, 60, 116, 63, 61, 149, 41, 54, 131, 27, 173};
        vMassCompare(operand7,operand8,expectedResults4);
// Tests PASSED

    }

    private static void vMassCompare(int[] operand1, int[] operand2, int[] expectedResults) {
        String resultG = "";
        String resultB = "";
        for (int i = 0; i < expectedResults.length; i++) {
            int c = operand1[i] + operand2[i];
            if (c == expectedResults[i]) {
                resultG = "Tests PASSED";
            } else {
                if (resultB == "") {
                    resultB = "Expected: " + expectedResults[i] + "; Actual: " + c;
                } else {
                    resultB += "\n" + "Expected: " + expectedResults[i] + "; Actual: " + c;
                }
            }
        }
        if (resultB != "") {
            System.out.println(resultB + "\n" + "Tests FAILED");
        } else {
            System.out.println(resultG);
        }
    }
}
