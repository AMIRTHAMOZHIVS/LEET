bool isPalindrome(int x) {
    int y = x;
    if(x<0){
        return false;
    }//palindrome
    long rev=0;
    while(x>0){
        int dig = x%10;
        rev=(rev*10)+dig;
        x/=10;
    }
    if(rev==y){
        return true;
    }
    return false;
}