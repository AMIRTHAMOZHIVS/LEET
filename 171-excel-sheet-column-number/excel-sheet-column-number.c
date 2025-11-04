int titleToNumber(char* columnTitle) {
    int i,res=0;
    for(i=0;i<strlen(columnTitle);i++){
        if(isalpha(columnTitle[i])){
            res = res*26+ (columnTitle[i]- 'A'+1);
        }
    }
    return res;
}