char nextGreatestLetter(char* letters, int n, char target) { // function parameters
        char res='{';  // Varuables
        for(int i=0;i<n;i++){    // Iterating through the array
            if(res>letters[i] && letters[i]>target){
                res=letters[i];
            }
        }
        if(res=='{'){
            return letters[0];
        }
        return res;
    
}
