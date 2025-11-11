char* shortestCompletingWord(char* licensePlate, char** words, int wordsSize) {
    int idx = 5555;
    int lp_hash_map[128] = {0};
    int wd_hash_map[128] = {0};
    bool match;

    for (int i = 0; licensePlate[i] != '\0'; ++i) {
        if (licensePlate[i] >= 65 && licensePlate[i] <= 90) {
            licensePlate[i] += 32;
        }
        ++lp_hash_map[licensePlate[i]];
    }

    for (int i = 0; i < wordsSize; ++i) {
        memset(wd_hash_map, 0, 128 * 4);
        
        for (int j = 0; words[i][j] != '\0'; ++j) {
            ++wd_hash_map[words[i][j]];
        }
        
        match = true;
        for (int k = 97; k <= 122; ++k) {
            if (lp_hash_map[k] > 1) {
                if (lp_hash_map[k] != wd_hash_map[k]) {
                    match = false;
                    break;
                }
            } else if (1 == lp_hash_map[k]) {
                if (0 == wd_hash_map[k]) {
                    match = false;
                    break;
                }
            }
        }
        if (true == match) {
            if (5555 == idx) {
                idx = i;
            } else {
                if (strlen(words[i]) < strlen(words[idx])) {
                    idx = i;
                }
            }
        }
    }
    
    return words[idx];
}