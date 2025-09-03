/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
double* convertTemperature(double celsius, int* returnSize) {
    static double returnSiz[2];
    returnSiz[0] = celsius+273.15;
    returnSiz[1] = (celsius*1.8)+32.00;
     *returnSize = 2;
     return returnSiz;
}