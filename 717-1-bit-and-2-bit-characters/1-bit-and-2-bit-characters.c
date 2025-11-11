bool isOneBitCharacter(int* bits, int bitsSize) {
    int lastElement = bitsSize - 1;
    int i = 0;
    
    if ((bits != NULL) && (bitsSize > 0))
    {
        if (bits[lastElement] == 1) return false;

        while (i < lastElement)
        {
            if (bits[i] == 1)
            {
                i+=2;
            }
            else
            {
                i++;
            }
        }
    }
    return (i == lastElement);
}