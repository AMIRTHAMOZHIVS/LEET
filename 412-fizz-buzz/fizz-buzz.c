/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** fizzBuzz(int n, int* returnSize) {
    // set return size
    *returnSize = n;

    // allocate array of string pointers
    char** result = malloc(n * sizeof(char*));

    for (int i = 0; i < n; i++) {
        // allocate memory for each string (max "FizzBuzz" + '\0' = 9)
        result[i] = malloc(9 * sizeof(char));

        if ((i + 1) % 15 == 0)
            sprintf(result[i], "FizzBuzz");
        else if ((i + 1) % 3 == 0)
            sprintf(result[i], "Fizz");
        else if ((i + 1) % 5 == 0)
            sprintf(result[i], "Buzz");
        else
            sprintf(result[i], "%d", i + 1);
    }

    return result;
}